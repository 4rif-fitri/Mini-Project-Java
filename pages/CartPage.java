package pages;

import components.*;
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


                //ade tak ni
                content.add(new CartBox());
                content.add(new CartBox());
                content.add(new CartBox());
                content.add(new CartBox());
                
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
