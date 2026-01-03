package components;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.*;

public class CartBox extends JPanel{
    private GlobalData GD;
    public final static int GAP = 24;
    public final static int HBOX = 100;

    public CartBox() {
        this.setVisible(true);
        this.setBackground(Color.decode("#d9d9d9"));
        this.setPreferredSize(new Dimension(GD.W * 8/10, HBOX));
        this.setLayout(new BorderLayout());
        this.setBorder(BorderFactory.createLineBorder(Color.decode("#b02323"), 2));
            JPanel panelWestBox = new JPanel();
            panelWestBox.setBackground(Color.decode("#d9d9d9"));
            panelWestBox.setPreferredSize(new Dimension(GlobalData.W * 7/10, HBOX));
            panelWestBox.setLayout(new GridLayout(3, 1));
            panelWestBox.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
                JLabel title = new JLabel("Pizza on a cup");
                title.setFont(new Font("Ariel", Font.BOLD, 27));
                JLabel category = new JLabel("Painting");
                JLabel price = new JLabel("RM 10.00");
            panelWestBox.add(title);
            panelWestBox.add(category);
            panelWestBox.add(price);
            JPanel panelEastBox = new JPanel();
            panelEastBox.setBackground(Color.decode("#d9d9d9"));
            panelEastBox.setLayout(new GridBagLayout());
                JButton removeBtn = new JButton("remove");
            panelEastBox.add(removeBtn);
            panelEastBox.setPreferredSize(new Dimension(GlobalData.W * 1/10, HBOX));
        this.add(panelWestBox, BorderLayout.CENTER);
        this.add(panelEastBox, BorderLayout.EAST);
    }
    
}
