package ejercicio;

import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JTextField;



import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Agregar extends JPanel {

	private static int contador = 1;
	JLabel lblPanelParaAgregar;
	JLabel lblID;
	JLabel lblError;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;

	public Agregar(DefaultListModel<Pelicula> modelo) {
		
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30,0,0,0,30,0};
		gridBagLayout.rowHeights = new int[]{30,0, 0,0,0,84,30,0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0,0.0, 0.0,0.0,0.0,0.0,0.0, Double.MIN_VALUE };
		setLayout(gridBagLayout);
		
		lblPanelParaAgregar = new JLabel("Panel para agregar pelicula");
		lblPanelParaAgregar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPanelParaAgregar.setBounds(104, 11, 242, 31);
		GridBagConstraints gbc_lblPanelParaAgregar = new GridBagConstraints();
		gbc_lblPanelParaAgregar.gridwidth = 4;
		gbc_lblPanelParaAgregar.insets = new Insets(0, 0, 5, 5);
		gbc_lblPanelParaAgregar.gridx = 1;
		gbc_lblPanelParaAgregar.gridy = 1;
		add(lblPanelParaAgregar, gbc_lblPanelParaAgregar);
		
		JLabel lblNewLabel = new JLabel("ID");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 2;
		gbc_lblNewLabel.gridy = 2;
		add(lblNewLabel, gbc_lblNewLabel);
		
		lblID = new JLabel("");
		GridBagConstraints gbc_lblID = new GridBagConstraints();
		gbc_lblID.anchor = GridBagConstraints.WEST;
		gbc_lblID.insets = new Insets(0, 0, 5, 5);
		gbc_lblID.gridx = 3;
		gbc_lblID.gridy = 2;
		add(lblID, gbc_lblID);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.WEST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 3;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.anchor = GridBagConstraints.NORTH;
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 3;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.anchor = GridBagConstraints.WEST;
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 2;
		gbc_lblGenero.gridy = 4;
		add(lblGenero, gbc_lblGenero);
		
		JComboBox<Genero> cbGenero = new JComboBox<Genero>();
		GridBagConstraints gbc_cbGenero = new GridBagConstraints();
		gbc_cbGenero.insets = new Insets(0, 0, 5, 5);
		gbc_cbGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbGenero.gridx = 3;
		gbc_cbGenero.gridy = 4;
		add(cbGenero, gbc_cbGenero);
		
		
		agregarGeneros(cbGenero);
		
		lblError = new JLabel("Debe completar los campos");
		lblError.setForeground(new Color(255, 0, 0));
		GridBagConstraints gbc_lblError = new GridBagConstraints();
		gbc_lblError.gridwidth = 2;
		gbc_lblError.insets = new Insets(0, 0, 0, 5);
		gbc_lblError.gridx = 2;
		gbc_lblError.gridy = 6;
		add(lblError, gbc_lblError);
		lblError.setVisible(false);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comprobacionDeCampos(txtNombre,cbGenero)) {
					lblError.setVisible(false);
					
				modelo.addElement(crearYcargarPelicula(txtNombre,cbGenero));
				lblID.setText(Integer.toString(contador));
					// campos lleno
				}else {
					lblError.setVisible(true);
				}
			}
		});
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.gridwidth = 2;
		gbc_btnAceptar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAceptar.gridx = 2;
		gbc_btnAceptar.gridy = 5;
		add(btnAceptar, gbc_btnAceptar);
		lblID.setText(String.valueOf(contador));
		
		
	}
	public static void agregarGeneros(JComboBox<Genero> cbGeneros) {
		cbGeneros.addItem(new Genero("Seleccione un genero"));
		cbGeneros.addItem(new Genero("Terror"));
		cbGeneros.addItem(new Genero("Accion"));
		cbGeneros.addItem(new Genero("Suspenso"));
		cbGeneros.addItem(new Genero("Romantica"));
	}
	public static boolean comprobacionDeCampos(JTextField txtNombre,JComboBox<Genero> cbGeneros) {
		boolean valido = false;
		if(!txtNombre.getText().trim().isEmpty() && cbGeneros.getSelectedIndex() != 0) {
			valido = true;
		}
		return valido;
	}
	public static Pelicula crearYcargarPelicula(JTextField txtNombre,JComboBox<Genero> cbGenero) {
		Pelicula peli = new Pelicula();
		peli.setId(contador);
		peli.setNombre(txtNombre.getText());
		peli.setGenero((Genero)cbGenero.getSelectedItem());
		txtNombre.setText("");
		cbGenero.setSelectedIndex(0);
		contador++;
		return peli;
	}
		
}
