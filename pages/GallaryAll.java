package pages;

import components.*;
import controllers.GambarController;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import models.Gambar;

public class GallaryAll extends JPanel {
	// bagi cardpanel n cardlayout untuk bagi akses ke page lain
	public GallaryAll(CardLayout cardLayout, JPanel cardPanel, GambarController data) {

		this.setVisible(true);
		this.setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());

		// main container
		JPanel content = new JPanel();

		content.setBackground(Color.CYAN);

		// main container ~ grid layout only 3 col n infinity row
		content.setLayout(new GridLayout(0, 3));

		for (Gambar item : data.getAll()) {
			content.add(new OnePicture(item));
		}
		// // bagi main container ade scroll
		JScrollPane scroll_conteiner = new JScrollPane(content);

		// layout setting
		this.add(new NavbarCatagory(cardLayout, cardPanel), java.awt.BorderLayout.NORTH);
		this.add(scroll_conteiner, java.awt.BorderLayout.CENTER);
		this.add(new Footer("HOME", cardLayout, cardPanel), java.awt.BorderLayout.SOUTH);
		// layout setting

	}
}
