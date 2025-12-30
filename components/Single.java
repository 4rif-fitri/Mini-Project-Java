package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import models.Gambar;

public class Single extends JFrame {
	public final static int width = 960 * 8 / 10;
	public final static int height = 540 * 8 / 10;
	public final static int gW = width * 3/10;
	public final static int gH = gW * 6/4;
	public Single(Gambar item, String src) { //get the url from img folder
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//this.setLayout(new GridLayout(1, 2));
		this.setSize(width, height);
		this.setLocationRelativeTo(null);



		JPanel panelGambar = new JPanel();
		panelGambar.setPreferredSize(new Dimension(width * 4/10, 0));
		panelGambar.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		panelGambar.setBackground(Color.decode("#b02323"));

		JLabel gambar = new JLabel();
		gambar.setIcon(new ImageIcon(getClass().getResource(src)));
		//label.setText("pizza");
		gambar.setPreferredSize(new Dimension(gW, gH));
		gambar.setBorder(new LineBorder(Color.decode("#ffbf00"), 10));
		panelGambar.add(gambar);
		//this.add(label);


		//BINA PANEL DESCRIPTION====================================================================
		JPanel panelDesc = new JPanel();
		panelDesc.setLayout(new BorderLayout());

			JPanel panel1 = new JPanel();
			panel1.setLayout(new GridLayout(2, 1));
				JLabel title = new JLabel(item.getName());
				title.setFont(new Font("Ariel", Font.BOLD, 27));
				JLabel category = new JLabel(item.getCatagory());
			panel1.add(title);
			panel1.add(category);

			JPanel panel2 = new JPanel();
				//ADE DESCRIPTION PUNYE TEXT======================================================================
				JTextArea desc = new JTextArea(
					"You see, pizza usually put on a plate or a flat board. " +
					"But this..this is masterpiece. This is truly out of this " + 
					"world. No camparison. Lets add more line to do some experiments"
				);
				desc.setPreferredSize(new Dimension(width * 6/10, height));
				desc.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
				//desc.setBackground(Color.decode("#eeeeee"));
				desc.setEditable(false);
				desc.setFocusable(false); // optional
				desc.setLineWrap(true);
				desc.setWrapStyleWord(true);
			panel2.add(desc);
			JPanel panel3 = new JPanel();
			panel3.setLayout(new GridLayout(1, 2));
				JLabel price = new JLabel("RM " + item.getPrice());
				JButton addToCart = new JButton("Add To Cart");
			panel3.add(price);
			panel3.add(addToCart);


		//LETAK SEMUA BENDA KAT PANEL DESCRIPTION======================================================================
		panelDesc.add(panel1, BorderLayout.NORTH);
		panelDesc.add(panel2, BorderLayout.CENTER);
		panelDesc.add(panel3, BorderLayout.SOUTH);
		//this.add(label2);



		this.add(panelGambar, BorderLayout.WEST);
		this.add(panelDesc, BorderLayout.CENTER);
		
	}
}
