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
	public ByCatagoty(CardLayout cardLayout, JPanel cardPanel) {
		
		this.setVisible(true);
		this.setBackground(Color.green);
		this.setLayout(new BorderLayout());

		JPanel content = new JPanel();
		content.setLayout(new GridLayout(0, 3));

		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton("Gambar " + i);
			btn.setPreferredSize(new Dimension(200, 200));
			btn.addActionListener(this);
			content.add(btn);
		}

		JScrollPane scroll_conteiner = new JScrollPane(content);

		this.add(new NavbarCatagory(cardLayout, cardPanel), BorderLayout.NORTH);
		this.add(scroll_conteiner, BorderLayout.CENTER);
		this.add(new Footer("GALLARY", cardLayout, cardPanel), BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Single("../img/3.png");
	}
}
