package components;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Single extends JFrame {
	public Single(String src) { //get the url from img folder
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(new GridLayout(2, 1));
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);

		JLabel label = new JLabel();
		label.setIcon(new javax.swing.ImageIcon(getClass().getResource(src)));
		label.setText("");
		this.add(label);

		JLabel label2 = new JLabel("LOREM aaaaaasqwdefrtyuio");
		this.add(label2);
		
	}
}
