package ejercicio;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Agregar extends JPanel {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Agregar() {
		setLayout(null);
		
		JLabel lblPanelParaAgregar = new JLabel("Panel para agregar pelicula");
		lblPanelParaAgregar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPanelParaAgregar.setBounds(107, 127, 242, 31);
		add(lblPanelParaAgregar);
		
	}
		
}
