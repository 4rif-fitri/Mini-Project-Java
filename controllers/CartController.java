package controllers;

import java.util.ArrayList;
import models.Gambar;

public class CartController {
	private static ArrayList<Gambar> shoppingCart = new ArrayList<>();

    public static void addToCart(Gambar item){
        shoppingCart.add(item);
        System.out.println("Received item of RM " + item.getPrice() + " at CartController");
    }
    

    public static ArrayList<Gambar> getCart(){
        return shoppingCart;
    }
}
