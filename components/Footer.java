package components;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.CardLayout;

public class Footer extends JPanel {
	public Footer(String location, CardLayout cardLayout, JPanel cardPanel) {
		this.setVisible(true);
		this.setBackground(Color.yellow);
		this.setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton btn_back = new JButton("BACK");
		this.add(btn_back);

		btn_back.addActionListener(e -> {
			cardLayout.show(cardPanel, location);
		});
	}
}
