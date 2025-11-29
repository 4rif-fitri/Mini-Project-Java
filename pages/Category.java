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
	public Category(CardLayout cardLayout, JPanel cardPanel) {
		this.setVisible(true);
		this.setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());

		JPanel content = new JPanel();
		content.setLayout(new GridLayout(3, 3));

		JButton btn1 = new JButton("lorem");
		JButton btn2 = new JButton("lorem");
		JButton btn3 = new JButton("lorem");
		JButton btn4 = new JButton("lorem");
		JButton btn5 = new JButton("lorem");
		JButton btn6 = new JButton("lorem");
		JButton btn7 = new JButton("lorem");
		JButton btn8 = new JButton("lorem");
		JButton btn9 = new JButton("lorem");

		content.add(btn1);
		content.add(btn2);
		content.add(btn3);
		content.add(btn4);
		content.add(btn5);
		content.add(btn6);
		content.add(btn7);
		content.add(btn8);
		content.add(btn9);

		this.add(new NavbarCatagory(cardLayout, cardPanel), BorderLayout.NORTH);
		this.add(content, BorderLayout.CENTER);
		this.add(new Footer("GALLARY", cardLayout, cardPanel), BorderLayout.SOUTH);

		btn1.addActionListener(e -> {
			cardLayout.show(cardPanel, "SINGLE");
		});

	}
}
