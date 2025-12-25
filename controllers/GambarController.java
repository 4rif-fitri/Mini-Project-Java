package controllers;

import java.util.ArrayList;
import models.Gambar;

public class GambarController {
	private ArrayList<Gambar> All = new ArrayList<>();
	private ArrayList<Gambar> Painting = new ArrayList<>();
	private ArrayList<Gambar> NFTArt = new ArrayList<>();
	private ArrayList<Gambar> Drawing=new ArrayList<>();
	private ArrayList<Gambar> Photography=new ArrayList<>();
	private ArrayList<Gambar> AbstractArt=new ArrayList<>();
	private ArrayList<Gambar> PopArt=new ArrayList<>();
	private ArrayList<Gambar> DigiArt=new ArrayList<>();
	private ArrayList<Gambar> TradArt=new ArrayList<>();

	

	public GambarController() {
		// Init static data
		All.add(new Gambar(1,"Lorem", "../img/3.png", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(2,"Lorem", "../img/4.png", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/5.png", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/_japan_lacquer_dipping_vat_1947.1.27.jpg", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/cigar_store_indian_1943.8.10087.jpg", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/cupboard_1943.8.7897.jpg", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/jug_1943.8.7380.jpg", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/roll-top_desk_1943.8.7878.jpg", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/self-portrait_1998.74.5.jpg", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/the_house_of_representatives_2014.79.27.jpg", "IPSUM", "Painting", 100.0));
		All.add(new Gambar(3,"Lorem", "../img/woman_with_a_parasol_-_madame_monet_and_her_son_1983.1.29.jpg", "IPSUM", "Painting", 100.0));


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
			} else if (item.getCatagory().equals("Drawing")) {
                Drawing.add(item);
            } else if (item.getCatagory().equals("Photography")) {
                Photography.add(item);
            } else if (item.getCatagory().equals("Abstract Art")) {
                AbstractArt.add(item);
            } else if (item.getCatagory().equals("Pop Art")) {
                PopArt.add(item);
            } else if (item.getCatagory().equals("Digital Art")) {
                DigiArt.add(item);
            } else if (item.getCatagory().equals("Traditional Art")) {
                TradArt.add(item);
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

	public ArrayList<Gambar> getDrawing() {
        return Drawing;
    }

    public ArrayList<Gambar> getPhotography() {
        return Photography;
    }

    public ArrayList<Gambar> getAbstractArt() {
        return AbstractArt;
    }

    public ArrayList<Gambar> getPopArt() {
        return PopArt;
    }

    public ArrayList<Gambar> getDigiArt() {
        return DigiArt;
    }

    public ArrayList<Gambar> getTradArt() {
        return TradArt;
    }
}
