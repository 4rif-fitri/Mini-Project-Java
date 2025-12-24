package pages;

import components.Footer;
import components.NavbarCatagory;
import components.OnePicture;
import controller.Data;
import controller.Gambar;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PictureByCategory extends JPanel {
	// bagi cardpanel n cardlayout untuk bagi akses ke page lain
	public PictureByCategory(CardLayout cardLayout, JPanel cardPanel, Data data) {

		this.setVisible(true);
		this.setBackground(Color.green);
		this.setLayout(new BorderLayout());

		JPanel content = new JPanel();
		// ~grid layout only 3 col n infinity row
		content.setLayout(new GridLayout(0, 3));

		// this loop akan ambil data data dari controller DATA.java base on catagory yg
		// user click

		for (Gambar item : data.getPainting()) {
			System.out.println("lorem");
			content.add(new OnePicture(item));
		}

		JScrollPane scroll_conteiner = new JScrollPane(content);

		// layout setting
		this.add(new NavbarCatagory(cardLayout, cardPanel), BorderLayout.NORTH);
		this.add(scroll_conteiner, BorderLayout.CENTER);
		this.add(new Footer("GALLARY", cardLayout, cardPanel), BorderLayout.SOUTH);
		// layout setting

	}


}
