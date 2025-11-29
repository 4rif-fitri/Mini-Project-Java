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
	public Gallary(CardLayout cardLayout, JPanel cardPanel) {
		this.setVisible(true);
		this.setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());

		JPanel content = new JPanel();

		content.setBackground(Color.CYAN);

		content.setLayout(new GridLayout(0, 3));

		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton("Gambar " + i);
			btn.setPreferredSize(new Dimension(200, 200));
			btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/p1.png")));
			content.add(btn);
		}

		JScrollPane scroll_conteiner = new JScrollPane(content);

		this.add(new NavbarCatagory(cardLayout, cardPanel), java.awt.BorderLayout.NORTH);
		this.add(scroll_conteiner, java.awt.BorderLayout.CENTER);
		this.add(new Footer("HOME", cardLayout, cardPanel), java.awt.BorderLayout.SOUTH);

		//

	}
}
