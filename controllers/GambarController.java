package controllers;

import java.util.ArrayList;
import models.Gambar;

public class GambarController {
	private ArrayList<Gambar> All = new ArrayList<>();
	private ArrayList<Gambar> Painting = new ArrayList<>();
	private ArrayList<Gambar> NFTArt = new ArrayList<>();

	public GambarController() {
		// Init static data
		All.add(new Gambar(1,"Lorem", "../img/3.png", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(2,"Lorem", "../img/4.png", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/5.png", "IPSUM", "Painting", 100.0));

		All.add(new Gambar(4,"Lorem", "../img/6.png", "IPSUM", "NFT Art", 100.0));
		All.add(new Gambar(5,"Lorem", "../img/7.png", "IPSUM", "NFT Art", 100.0));
		All.add(new Gambar(6,"Lorem", "../img/8.png", "IPSUM", "NFT Art", 100.0));

		// ....
		// ....
		// ....

		// Init static data

		filter();
	}

	public void filter() {
		for (Gambar item : All) {
			if (item.getCatagory().equals("Painting")) {
				Painting.add(item);
			} else if (item.getCatagory().equals("NFT Art")) {
				NFTArt.add(item);
			}
		}
	}

	public ArrayList<Gambar> getPainting() {
		return Painting;
	}

	public ArrayList<Gambar> getNFTArt() {
		return NFTArt;
	}

	public  ArrayList<Gambar> getAll() {
		return All;
	}

}
