package pages;

import components.Footer;
import components.NavbarCatagory;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Category extends JPanel implements ActionListener{
	// bagi cardpanel n cardlayout untuk bagi akses ke page lain
	private String[] buttonNames = {"Painting", "Drawing", "Sculpture", "Digital Art", "Photography", "Abstract Art", "Traditional Art", "NFT Art", "Pop Art"};

	public Category(CardLayout cardLayout, JPanel cardPanel) {
		this.setVisible(true);
		this.setBackground(Color.BLUE);
		this.setLayout(new BorderLayout());

		JPanel content = new JPanel();
		content.setLayout(new GridLayout(3, 3));

		//buat loop plss n bile user click btn akan ade data kategory apa dihantar ke ByCatagory.java tuk loop data
		// for loop insyaallah
		for (String buttonName : buttonNames){
			JButton btnNew = new JButton(buttonName);
			btnNew.addActionListener(this);
			content.add(btnNew);
		}
		

		// layout setting
		this.add(new NavbarCatagory(cardLayout, cardPanel), BorderLayout.NORTH);
		this.add(content, BorderLayout.CENTER);
		this.add(new Footer("GALLARY", cardLayout, cardPanel), BorderLayout.SOUTH);
		// layout setting

		// even listerner
		// =>
		// =>
		// =>
		
	}

	public void actionPerformed(ActionEvent e){
			System.out.println("Action command string: " + e.getActionCommand());
	}
}
