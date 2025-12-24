package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import controller.Gambar;

public class OnePicture extends JButton {
	public OnePicture(Gambar item){
			this.setPreferredSize(new Dimension(200, 250));
			this.setIcon(new javax.swing.ImageIcon(getClass().getResource(item.url)));
			JPanel pnl = new JPanel();
			this.setLayout(new BorderLayout());
			pnl.setBackground(Color.yellow);
			pnl.setBorder(new LineBorder(Color.black, 2, true));
			this.setBorder(new LineBorder(Color.black, 1, true));
			JButton addToCart = new JButton("Add To Cart");
			JLabel harga = new JLabel(item.name);
			JLabel name = new JLabel("RM " + item.price);
			JLabel catagory = new JLabel("RM " + item.catagory);
			pnl.add(name);
			pnl.add(catagory);
			pnl.add(harga);
			pnl.add(addToCart);

			this.addActionListener(e->{
				new Single("../img/3.png");

			});
			this.add(pnl,BorderLayout.SOUTH);
	}

		// even listerner
	// =>
	// =>
	// =>
}
