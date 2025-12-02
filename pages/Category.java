package pages;

import javax.swing.JPanel;

import components.Footer;
import components.NavbarCatagory;

import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.CardLayout;

public class Category extends JPanel {
	// bagi cardpanel n cardlayout untuk bagi akses ke page lain
	public Category(CardLayout cardLayout, JPanel cardPanel) {
		this.setVisible(true);
		this.setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());

		JPanel content = new JPanel();
		content.setLayout(new GridLayout(3, 3));

		//buat loop plss n bile user click btn akan ade data kategory apa dihantar ke ByCatagory.java tuk loop data
		JButton btn1 = new JButton("Catagory 1");
		JButton btn2 = new JButton("Catagory 2");
		JButton btn3 = new JButton("Catagory 3");
		JButton btn4 = new JButton("Catagory 4");
		JButton btn5 = new JButton("Catagory 5");
		JButton btn6 = new JButton("Catagory 6");
		JButton btn7 = new JButton("Catagory 7");
		JButton btn8 = new JButton("Catagory 6");
		JButton btn9 = new JButton("Catagory 9");

		content.add(btn1);
		content.add(btn2);
		content.add(btn3);
		content.add(btn4);
		content.add(btn5);
		content.add(btn6);
		content.add(btn7);
		content.add(btn8);
		content.add(btn9);

		// layout setting
		this.add(new NavbarCatagory(cardLayout, cardPanel), BorderLayout.NORTH);
		this.add(content, BorderLayout.CENTER);
		this.add(new Footer("GALLARY", cardLayout, cardPanel), BorderLayout.SOUTH);
		// layout setting

		// even listerner
		// =>
		// =>
		// =>
		btn1.addActionListener(e -> {
			cardLayout.show(cardPanel, "SINGLE");
		});

	}
}
