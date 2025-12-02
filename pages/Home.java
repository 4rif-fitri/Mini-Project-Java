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

		//dua main container
		JPanel kiri = new JPanel();
		JPanel kanan = new JPanel();

		kiri.setBackground(Color.cyan);
		kanan.setBackground(Color.green);

		//panel dalam container yg center
		JPanel panelCenter = new JPanel();
		panelCenter.setBackground(Color.RED);
		panelCenter.setPreferredSize(new Dimension(300, 300));

		// panel dalam container yg center
		JPanel panelCenter2 = new JPanel();
		panelCenter.setBackground(Color.RED);
		panelCenter2.setPreferredSize(new Dimension(300, 300));

		// pic dlm panel center kanan
		JLabel label = new JLabel();
		label.setIcon(new javax.swing.ImageIcon(getClass().getResource("../img/p1.png")));
		label.setText("");
		panelCenter.add(label);
		
		//Text dlm panel center kiri
		JLabel label2 = new JLabel("Lorem ipsum dolor sit amet");
		JLabel label3 = new JLabel("consectetur adipiscing elit, sed do eiusmod tempor");
		JLabel label4 = new JLabel("Lorem ipsum dolor sit amet");
		
		//add text n pic to panel
		panelCenter2.add(label2);
		panelCenter2.add(label3);
		panelCenter2.add(label4);

		//Center panel
		kanan.setLayout(new GridBagLayout());
		kanan.add(panelCenter);	
		kiri.setLayout(new GridBagLayout());
		kiri.add(panelCenter2);
		//Center panel

		//add panel to container
		this.add(kiri);
		this.add(kanan);

	}

}
