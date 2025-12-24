package components;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class Navbar extends JPanel {
	public Navbar(CardLayout cardLayout, JPanel cardPanel) {

		this.setVisible(true);
		this.setLayout(new BorderLayout());
		this.setSize(700, 400);

		JComboBox<String> nav = new JComboBox<>();

		String[] items = { "Navbar", "HOME", "GALLARY", "CART" };
		nav.setModel(new DefaultComboBoxModel<>(items));

		this.add(nav, java.awt.BorderLayout.NORTH);

		// event listener

		nav.addItemListener(e -> {

			if (e.getStateChange() == ItemEvent.SELECTED) {
				String key = (String) e.getItem();
				// System.out.println(key);
				cardLayout.show(cardPanel, key);
				nav.setSelectedIndex(0);
			}

		});

	}
}
