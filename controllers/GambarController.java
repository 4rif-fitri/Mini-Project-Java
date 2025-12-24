package controllers;

import java.util.ArrayList;
import models.Gambar;

public class GambarController {
	public static ArrayList<Gambar> All = new ArrayList<>();
	public static ArrayList<Gambar> Painting = new ArrayList<>();
	public static ArrayList<Gambar> NFTArt = new ArrayList<>();

	public GambarController() {
		All.add(new Gambar("Lorem", "../img/3.png", "IPSUM", "Painting", 100.0));
		All.add(new Gambar("Lorem", "../img/4.png", "IPSUM", "Painting", 100.0));
		All.add(new Gambar("Lorem", "../img/5.png", "IPSUM", "Painting", 100.0));

		All.add(new Gambar("Lorem", "../img/6.png", "IPSUM", "NFT Art", 100.0));
		All.add(new Gambar("Lorem", "../img/7.png", "IPSUM", "NFT Art", 100.0));
		All.add(new Gambar("Lorem", "../img/8.png", "IPSUM", "NFT Art", 100.0));
		// Init static data

		// ....
		// ....
		// ....

		// Init static data

		filter();
	}

	public static void filter() {
		for (Gambar item : All) {
			if (item.catagory.equals("Painting")) {
				Painting.add(item);
			} else if (item.catagory.equals("NFT Art")) {
				NFTArt.add(item);
			}
		}
	}

	public static ArrayList<Gambar> getPainting() {
		return Painting;
	}

	public static ArrayList<Gambar> getNFTArt() {
		return NFTArt;
	}

	public static ArrayList<Gambar> getAll() {
		return All;
	}

}
