package controller;

import java.util.ArrayList;

public class Data {
    public ArrayList<Gambar> ART_BEARAT;
    public ArrayList<Gambar> ART_KLASIK;
		public ArrayList<Gambar> ART_MODEN;

    public Data(){
        	ART_BEARAT = new ArrayList<>();
        	ART_BEARAT.add(new Gambar("Lorem", "../img/p1.png", "IPSUM"));
        	ART_BEARAT.add(new Gambar("Lorem", "../img/p1.png", "IPSUM"));
			ART_BEARAT.add(new Gambar("Lorem", "../img/p1.png", "IPSUM"));

			ART_KLASIK = new ArrayList<>();
			ART_KLASIK.add(new Gambar("Lorem", "../img/p1.png", "IPSUM"));
			ART_KLASIK.add(new Gambar("Lorem", "../img/p1.png", "IPSUM"));
			ART_KLASIK.add(new Gambar("Lorem", "../img/p1.png", "IPSUM"));
    }

	 public ArrayList<Gambar> returnData(){
		return ART_BEARAT; //contoh
	 }
}
