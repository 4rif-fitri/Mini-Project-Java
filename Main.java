import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import components.Navbar;

import java.awt.BorderLayout;
import java.awt.CardLayout;

import pages.*;

public class Main {

	public JFrame frame = new JFrame();
	private CardLayout cardLayout = new CardLayout();
	private JPanel cardPanel = new JPanel(cardLayout);

	final static String HOME = "HOME";
	final static String GALLARY = "GALLARY";
	final static String CATEGORY = "CATEGORY";
	final static String SINGLE = "SINGLE";

	public Main() {
		frame.setVisible(true);
		frame.setSize(900, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

						//    panel , Key
		cardPanel.add(new Home(), HOME); // add page home
		cardPanel.add(new Gallary(cardLayout, cardPanel), GALLARY);
		cardPanel.add(new Category(cardLayout, cardPanel), CATEGORY);
		cardPanel.add(new ByCatagoty(cardLayout, cardPanel), SINGLE);

		cardLayout.show(cardPanel, HOME); //SHOW PANEL FUNC <===

		//layout setting
		frame.getContentPane().add(new Navbar(cardLayout, cardPanel), BorderLayout.NORTH);
		frame.getContentPane().add(cardPanel, BorderLayout.CENTER);
		frame.setLocationRelativeTo(null);
		// layout setting

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new Main();
		});
	}

}