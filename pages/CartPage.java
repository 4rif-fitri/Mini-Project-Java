package pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import models.GlobalData;

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


                    JPanel box = new JPanel();
                    box.setBackground(Color.decode("#d9d9d9"));
                    box.setPreferredSize(new Dimension(GD.W * 8/10, HBOX));

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
                    JLabel totalPrice = new JLabel("RM 1000");
                    totalPrice.setForeground(Color.white);
                    JButton buttonCheckOut = new JButton("CheckOut");
                panelCheckOut.add(totalPrice);
                panelCheckOut.add(buttonCheckOut);

                

            this.add(scroll_container, BorderLayout.CENTER);
            this.add(panelCheckOut, BorderLayout.SOUTH);
                
            
        }
}
