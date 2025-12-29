package components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class Single extends JFrame {
	public final static int width = 960 * 8 / 10;
	public final static int height = 540 * 8 / 10;
	public final static int gW = width * 3/10;
	public final static int gH = gW * 6/4;
	public Single(String src) { //get the url from img folder
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



		JPanel panelDesc = new JPanel();

		JLabel title = new JLabel("Pizza on a Cup");
		title.setFont(new Font("Ariel", Font.BOLD, 27));
		JTextArea desc = new JTextArea(
			"You see, pizza usually put on a plate or a flat board. " +
			"But this..this is masterpiece. This is truly out of this " + 
			"world. No camparison."
		);
		desc.setPreferredSize(new Dimension(368, 200));
		desc.setEditable(false);
		desc.setFocusable(false); // optional
		desc.setLineWrap(true);
		desc.setWrapStyleWord(true);
		panelDesc.add(title);
		panelDesc.add(desc);
		//this.add(label2);



		this.add(panelGambar, BorderLayout.WEST);
		this.add(panelDesc, BorderLayout.CENTER);
		
	}
}
