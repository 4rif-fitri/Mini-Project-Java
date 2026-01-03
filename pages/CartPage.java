package pages;

import controllers.CartController;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import models.*;

public class CartPage extends JPanel {
        private GlobalData GD;
        public final static int GAP = 24;
        public final static int HBOX = 100;

        public CartPage(GlobalData globalData){
            this.GD = globalData;
            this.setVisible(true);
            this.setBackground(Color.BLUE);
            this.setPreferredSize(new Dimension(GD.W, GD.H));
            this.setLayout(new BorderLayout());

                JPanel content = new JPanel();
                content.setBackground(Color.white);
                content.setLayout(new GridLayout(0, 1, GAP, GAP));
                content.setBorder(BorderFactory.createEmptyBorder(GAP, GAP, GAP, GAP));
                //content.setBorder(BorderFactory.);

                    for (Gambar item : CartController.getCart()) {
			            //content.add(new modelboximran(item));
		            }

                    JPanel box = new JPanel();
                    box.setBackground(Color.decode("#d9d9d9"));
                    box.setPreferredSize(new Dimension(GD.W * 8/10, HBOX));
                    box.setLayout(new BorderLayout());
                    box.setBorder(BorderFactory.createLineBorder(Color.decode("#b02323"), 2));
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
                    box.add(panelWestBox, BorderLayout.CENTER);
                    box.add(panelEastBox, BorderLayout.EAST);

                    JPanel box1 = new JPanel();
                    box1.setBackground(Color.decode("#d9d9d9"));
                    box1.setPreferredSize(new Dimension(GD.W * 8/10, HBOX));

                    JPanel box2 = new JPanel();
                    box2.setBackground(Color.decode("#d9d9d9"));
                    box2.setPreferredSize(new Dimension(GD.W * 8/10, HBOX));

                    JPanel box3 = new JPanel();
                    box3.setBackground(Color.decode("#d9d9d9"));
                    box3.setPreferredSize(new Dimension(GD.W * 8/10, HBOX));

                    JPanel box4 = new JPanel();
                    box4.setBackground(Color.decode("#d9d9d9"));
                    box4.setPreferredSize(new Dimension(GD.W * 8/10, HBOX));

                    

                content.add(box);
                content.add(box1);
                content.add(box2);
                content.add(box3);
                content.add(box4);
                JScrollPane scroll_container = new JScrollPane(content);
                scroll_container.getVerticalScrollBar().setUnitIncrement(20);

                JPanel panelCheckOut = new JPanel();
                panelCheckOut.setBackground(Color.decode("#b02323"));
                panelCheckOut.setPreferredSize(new Dimension(GD.W, 50));
                panelCheckOut.setLayout(new FlowLayout(FlowLayout.RIGHT));
                    JLabel totalPrice = new JLabel("RM " + getCartTotal());
                    totalPrice.setForeground(Color.white);
                    JButton buttonCheckOut = new JButton("CheckOut");
                panelCheckOut.add(totalPrice);
                panelCheckOut.add(buttonCheckOut);

                

            this.add(scroll_container, BorderLayout.CENTER);
            this.add(panelCheckOut, BorderLayout.SOUTH);
                
            
        }
    
    private double getCartTotal(){
        double total = 0;
        for (Gambar item : CartController.getCart()) {
            total += item.getPrice();
		}
        return total;
    }
}
