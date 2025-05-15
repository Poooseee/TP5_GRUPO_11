package ejercicio;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private DefaultListModel<Pelicula> lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DefaultListModel<Pelicula> lista = new DefaultListModel<>();
					Principal frame = new Principal(lista);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal(DefaultListModel<Pelicula> lista) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.lista = lista;
		setBounds(100, 100, 450, 450);
		setTitle("TP5_GRUPO_11");
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//Creas la menu bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		//Creas el menu
		JMenu mnPeliculas = new JMenu("Peliculas");
		menuBar.add(mnPeliculas);

		//Creas Item AGREGAR, configuras el listener y lo agregas al menu
		JMenuItem mntmAgregar = new JMenuItem("Agregar");
		mnPeliculas.add(mntmAgregar);
		JMenuItem mntmListar = new JMenuItem("Listar");
		mnPeliculas.add(mntmListar);

		mntmAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				Agregar panel = new Agregar(lista);
				contentPane.add(panel, BorderLayout.CENTER);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		
		
		//Creas Item Listar, configuras el listener y lo agregas al menu
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.removeAll();
				Listar panel = new Listar(lista);
				contentPane.add(panel, BorderLayout.CENTER);
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		
		/*CONFIGURAR LISTENER Y AGREGAR AL MENU CON ADD*/
		
		

	}
}
