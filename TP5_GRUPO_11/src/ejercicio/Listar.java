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
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.AbstractListModel;

public class Listar extends JPanel {

	private static final long serialVersionUID = 1L;

	
	public Listar(DefaultListModel<Pelicula> modelo) {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblPeliculas = new JLabel("Peliculas  ");
		lblPeliculas.setFont(new Font("Yu Gothic", Font.PLAIN, 14));
		add(lblPeliculas, BorderLayout.WEST);
		
		JList list = new JList();
		add(list, BorderLayout.CENTER);
	
		list.setModel(OrdenarAlfabeticamente(modelo));
	}
	
	public DefaultListModel<Pelicula> OrdenarAlfabeticamente(DefaultListModel<Pelicula> lista){
		ArrayList<Pelicula> elementos = new ArrayList<>();
		for (int i = 0; i < lista.getSize(); i++) {
            elementos.add(lista.getElementAt(i));
        }
        Collections.sort(elementos);
        lista.clear();
        for (Pelicula elemento : elementos) {
            lista.addElement(elemento);
        }
		return lista;
	}
}
