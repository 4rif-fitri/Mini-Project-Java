package pages;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.CardLayout;

import components.*;
import java.awt.Dimension;

public class Gallary extends JPanel {
	// bagi cardpanel n cardlayout untuk bagi akses ke page lain
	public Gallary(CardLayout cardLayout, JPanel cardPanel) {

		this.setVisible(true);
		this.setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());

		//main container
		JPanel content = new JPanel();

		content.setBackground(Color.CYAN);

		// main container ~ grid layout only 3 col n infinity row
		content.setLayout(new GridLayout(0, 3));

		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton("Gambar " + i);
			btn.setPreferredSize(new Dimension(200, 200));
			btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/p1.png")));
			
			//add to main container
			content.add(btn);
		}
		//bagi main container ade scroll
		JScrollPane scroll_conteiner = new JScrollPane(content);
		
		// layout setting
		this.add(new NavbarCatagory(cardLayout, cardPanel), java.awt.BorderLayout.NORTH);
		this.add(scroll_conteiner, java.awt.BorderLayout.CENTER);
		this.add(new Footer("HOME", cardLayout, cardPanel), java.awt.BorderLayout.SOUTH);
		// layout setting

		//even listerner
		//=>
		//=>
		//=>

	}
}
