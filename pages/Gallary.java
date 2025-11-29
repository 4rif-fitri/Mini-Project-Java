package pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.CardLayout;

import components.*;

public class Gallary extends JPanel {
	public Gallary(CardLayout cardLayout, JPanel cardPanel) {
		this.setVisible(true);
		this.setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());

		JPanel content = new JPanel();

		content.setBackground(Color.CYAN);
		// content.setLayout(new FlowLayout(FlowLayout.LEFT));

		this.add(new NavbarCatagory(cardLayout, cardPanel), java.awt.BorderLayout.NORTH);
		// this.add(content, java.awt.BorderLayout.CENTER);
		this.add(new Footer("HOME", cardLayout, cardPanel), java.awt.BorderLayout.SOUTH);

		//

	}
}
