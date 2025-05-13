package ejercicio;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import java.awt.Insets;
import javax.swing.BoxLayout;
import java.awt.Font;

public class Listar extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Listar() {
		setLayout(null);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		lblPeliculas.setBounds(48, 130, 67, 24);
		add(lblPeliculas);
		
		JList list = new JList();
		list.setBounds(158, 47, 220, 200);
		add(list);

	}
}
