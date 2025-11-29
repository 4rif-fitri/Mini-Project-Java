package pages;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import components.Footer;
import components.NavbarCatagory;
import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ByCatagoty extends JPanel implements ActionListener{
	public ByCatagoty(CardLayout cardLayout, JPanel cardPanel) {
		this.setVisible(true);
		this.setBackground(Color.green);
		this.setLayout(new BorderLayout());

		JPanel content = new JPanel();
		content.setLayout(new GridLayout(3,3));

		JButton btn1 = new JButton("GAMBAR");
		JButton btn2 = new JButton("GAMBAR");
		JButton btn3 = new JButton("GAMBAR");
		JButton btn4 = new JButton("GAMBAR");
		JButton btn5 = new JButton("GAMBAR");
		JButton btn6 = new JButton("GAMBAR");
		JButton btn7 = new JButton("GAMBAR");
		JButton btn8 = new JButton("GAMBAR");
		JButton btn9 = new JButton("GAMBAR");

		content.add(btn1);
		content.add(btn2);
		content.add(btn3);
		content.add(btn4);
		content.add(btn5);
		content.add(btn6);
		content.add(btn7);
		content.add(btn8);
		content.add(btn9);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);

		this.add(new NavbarCatagory(cardLayout, cardPanel), BorderLayout.NORTH);
		this.add(content, BorderLayout.CENTER);
		this.add(new Footer("GALLARY", cardLayout, cardPanel), BorderLayout.SOUTH);

		// btn1.addActionListener(e -> {
		// 	new Single("../img/p1.png");
		// });

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			new Single("../img/p1.png");
	}
}
