package models;

import java.awt.Desktop;
import java.net.URI;
import java.net.URLEncoder;
public class Gambar  {
	private int id;
	private double price;
	private String name;
	private String url;
	private String catagory;
	private String artisName;

	public Gambar(int id,String name, String url, String artisName, String catagory, double price){
		this.name = name;
		this.url = url;
		this.artisName = artisName;
		this.catagory = catagory;
		this.price = price;
		this.id = id;
	}
	
	public String getCatagory() {
		return catagory;
	}

    public String getArtisName() {
        return artisName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

	public String getUrl() {
		return url;
	}

	public void sendWhatsApp() {
		try {
			String phone = "60197231577";
			String msg = "Hai saya nak tanya pasal produk: " + name;

			String link = "https://wa.me/" + phone +
					"?text=" + URLEncoder.encode(msg, "UTF-8");

			Desktop.getDesktop().browse(new URI(link));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
