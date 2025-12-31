package pages;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class CartPage extends JPanel {
        public final static int width = 960;
        public final static int height = 540;
        public final static int gap = 24;
        public final static int something = 100;

        public CartPage(){
            this.setVisible(true);
            this.setBackground(Color.BLUE);
            this.setPreferredSize(new Dimension(width, height));
            this.setLayout(new BorderLayout());

                JPanel content = new JPanel();
                content.setBackground(Color.white);
                content.setLayout(new GridLayout(0, 1, gap, gap));
                content.setBorder(BorderFactory.createEmptyBorder(gap, gap, gap, gap));
                //content.setBorder(BorderFactory.);


                    JPanel box = new JPanel();
                    box.setBackground(Color.decode("#d9d9d9"));
                    box.setPreferredSize(new Dimension(width * 8/10, something));

                    JPanel box1 = new JPanel();
                    box1.setBackground(Color.decode("#d9d9d9"));
                    box1.setPreferredSize(new Dimension(width * 8/10, something));

                    JPanel box2 = new JPanel();
                    box2.setBackground(Color.decode("#d9d9d9"));
                    box2.setPreferredSize(new Dimension(width * 8/10, something));

                    JPanel box3 = new JPanel();
                    box3.setBackground(Color.decode("#d9d9d9"));
                    box3.setPreferredSize(new Dimension(width * 8/10, something));

                    JPanel box4 = new JPanel();
                    box4.setBackground(Color.decode("#d9d9d9"));
                    box4.setPreferredSize(new Dimension(width * 8/10, something));

                    

                content.add(box);
                content.add(box1);
                content.add(box2);
                content.add(box3);
                content.add(box4);
                JScrollPane scroll_container = new JScrollPane(content);
                scroll_container.getVerticalScrollBar().setUnitIncrement(20);

                JPanel panelCheckOut = new JPanel();
                panelCheckOut.setBackground(Color.decode("#b02323"));
                panelCheckOut.setPreferredSize(new Dimension(width, 50));

            this.add(scroll_container, BorderLayout.CENTER);
            this.add(panelCheckOut, BorderLayout.SOUTH);
                
            
        }
}
