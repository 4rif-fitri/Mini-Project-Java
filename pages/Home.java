package pages;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.GridBagLayout;

public class Home extends JPanel {

	public Home() {
		this.setVisible(true);
		this.setBackground(Color.yellow);
		this.setLayout(new GridLayout(1, 2));

		JPanel kiri = new JPanel();
		JPanel kanan = new JPanel();

		kiri.setBackground(Color.cyan);
		kanan.setBackground(Color.green);

		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.RED);
		panelCenter.setPreferredSize(new Dimension(300, 300));

		JPanel panelCenter2 = new JPanel();
		panelCenter.setBackground(Color.RED);
		panelCenter2.setPreferredSize(new Dimension(300, 300));

		JLabel label = new JLabel();
		label.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/p1.png")));
		label.setText("");
		panelCenter.add(label);

		JLabel label2 = new JLabel("Lorem ipsum dolor sit amet");
		JLabel label3 = new JLabel("consectetur adipiscing elit, sed do eiusmod tempor");
		JLabel label4 = new JLabel("Lorem ipsum dolor sit amet");
		
		panelCenter2.add(label2);
		panelCenter2.add(label3);
		panelCenter2.add(label4);

		kanan.setLayout(new GridBagLayout());
		kanan.add(panelCenter);	

		kiri.setLayout(new GridBagLayout());
		kiri.add(panelCenter2);

		this.add(kiri);
		this.add(kanan);

	}

}
