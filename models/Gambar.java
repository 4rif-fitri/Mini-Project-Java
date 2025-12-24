package models;
public class Gambar {
	public String name;
	public String url;
	public String catagory;
	public double price;
	public String artisName;

	public Gambar(String name, String url, String artisName, String catagory, double price){
		this.name = name;
		this.url = url;
		this.artisName = artisName;
		this.catagory = catagory;
		this.price = price;
	}

}
