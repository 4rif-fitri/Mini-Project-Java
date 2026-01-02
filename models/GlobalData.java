package models;
import java.awt.CardLayout;
import javax.swing.JPanel;
import pages.*;
//asd
public class GlobalData {
    private CartPage cartPage;
    private Category category;
    private GallaryAll gallaryAll;
    private Home home;
    private PicturesByCategory picturesByCategory;
    public CardLayout cardLayout;
    public JPanel cardPanel;
    
    public String[] categories = {"Painting", "Drawing", "Sculpture", "Digital Art", "Photography", "Abstract Art", "Traditional Art", "NFT Art", "Pop Art"};

    public GlobalData(CardLayout cardLayout, JPanel cardPanel){
        this.cardLayout = cardLayout;
        this.cardPanel = cardPanel;
    }

    public void updateAlamatOfPages(Category category, PicturesByCategory byCategroy){
        this.category = category;
        this.picturesByCategory = byCategroy;
    }

    public void sendSelectedCategory(String selectedCategory){
        picturesByCategory.loadSelectedCategory(selectedCategory);
    }
}
