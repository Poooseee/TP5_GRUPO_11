package ejercicio;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JList;
import java.awt.Insets;
import java.security.PublicKey;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.AbstractListModel;

public class Listar extends JPanel {

	private static final long serialVersionUID = 1L;
	
	public Listar() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblPeliculas = new JLabel("Peliculas  ");
		lblPeliculas.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		add(lblPeliculas, BorderLayout.WEST);
		
		JList list = new JList();
		add(list, BorderLayout.CENTER);
		
	}
}
