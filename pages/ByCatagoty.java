package pages;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import components.Footer;
import components.NavbarCatagory;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;

public class ByCatagoty extends JPanel implements ActionListener {
	// bagi cardpanel n cardlayout untuk bagi akses ke page lain
	public ByCatagoty(CardLayout cardLayout, JPanel cardPanel) {
		
		this.setVisible(true);
		this.setBackground(Color.green);
		this.setLayout(new BorderLayout());

		JPanel content = new JPanel();
		// ~grid layout only 3 col n infinity row
		content.setLayout(new GridLayout(0, 3));

		// this loop akan ambil data data dari controller DATA.java base on catagory yg user click
		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton("Gambar " + i);
			btn.setPreferredSize(new Dimension(200, 200));
			btn.addActionListener(this);
			content.add(btn);
		}

		JScrollPane scroll_conteiner = new JScrollPane(content);

		// layout setting
		this.add(new NavbarCatagory(cardLayout, cardPanel), BorderLayout.NORTH);
		this.add(scroll_conteiner, BorderLayout.CENTER);
		this.add(new Footer("GALLARY", cardLayout, cardPanel), BorderLayout.SOUTH);
		// layout setting

	}

	// even listerner
	// =>
	// =>
	// =>
	@Override
	public void actionPerformed(ActionEvent e) {
		new Single("../img/3.png");
	}
}
