package models;
import controllers.CartController;
import controllers.GambarController;
import java.awt.CardLayout;
import javax.swing.JPanel;
import pages.*;

public class GlobalData {
    public final static int W = 960;
    public final static int H = 540;
    
    private static CartController cartController;
    private static GambarController gambarController;
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

    public void updateAlamatOfControllers(CartController cartCont, GambarController gambarCont){
        cartController = cartCont;
        gambarController = gambarCont;
    }
    public void updateAlamatOfPages(Category category, PicturesByCategory byCategroy){
        this.category = category;
        this.picturesByCategory = byCategroy;
    }

    public void sendSelectedCategory(String selectedCategory){
        picturesByCategory.loadSelectedCategory(selectedCategory);
    }

    public static void sendToCart(Gambar gambar){
        CartController.addToCart(gambar);
    }

    public static void updateCart(){
        CartPage.loadCartPage();
    }

    public static void sendArtToRemove(Gambar item){
        gambarController.removeArt(item);
    }
}
