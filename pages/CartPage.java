package pages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CartPage extends JPanel {
        public final static int width = 960;
        public final static int height = 540;
        public final static int gap = 48;

        public CartPage(){
            this.setVisible(true);
            this.setBackground(Color.BLUE);
            this.setPreferredSize(new Dimension(width, height));

                JPanel content = new JPanel();
                content.setBackground(Color.white);
                content.setLayout(new GridLayout(0, 1, gap, gap));
                content.setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));

                JScrollPane scroll_container = new JScrollPane(this);


                    JPanel box = new JPanel();
                    box.setBackground(Color.decode("#d9d9d9"));
                    box.setPreferredSize(new Dimension(width * 8/10, 100));

                    JPanel box1 = new JPanel();
                    box1.setBackground(Color.decode("#d9d9d9"));
                    box1.setPreferredSize(new Dimension(width * 8/10, 100));

                    JPanel box2 = new JPanel();
                    box2.setBackground(Color.decode("#d9d9d9"));
                    box2.setPreferredSize(new Dimension(width * 8/10, 100));

                    JPanel box3 = new JPanel();
                    box3.setBackground(Color.decode("#d9d9d9"));
                    box3.setPreferredSize(new Dimension(width * 8/10, 100));

                    JPanel box4 = new JPanel();
                    box4.setBackground(Color.decode("#d9d9d9"));
                    box4.setPreferredSize(new Dimension(width * 8/10, 100));

             
                
            
        }
}
