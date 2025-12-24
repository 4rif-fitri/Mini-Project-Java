package controllers;

import java.util.ArrayList;
import models.Gambar;

public class GambarController {
	public static ArrayList<Gambar> All = new ArrayList<>();
	public static ArrayList<Gambar> Painting = new ArrayList<>();
	public static ArrayList<Gambar> NFTArt = new ArrayList<>();

	public GambarController() {
		All.add(new Gambar(1,"Lorem", "../img/3.png", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(2,"Lorem", "../img/4.png", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/5.png", "IPSUM", "Painting", 100.0));

		All.add(new Gambar(4,"Lorem", "../img/6.png", "IPSUM", "NFT Art", 100.0));
		All.add(new Gambar(5,"Lorem", "../img/7.png", "IPSUM", "NFT Art", 100.0));
		All.add(new Gambar(6,"Lorem", "../img/8.png", "IPSUM", "NFT Art", 100.0));
		// Init static data

		// ....
		// ....
		// ....

		// Init static data

		filter();
	}

	public static void filter() {
		for (Gambar item : All) {
			if (item.getCatagory().equals("Painting")) {
				Painting.add(item);
			} else if (item.getCatagory().equals("NFT Art")) {
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
