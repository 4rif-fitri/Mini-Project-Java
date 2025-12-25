package models;

import java.awt.Desktop;
import java.net.URI;
import java.net.URLEncoder;

public class Cart {
	

	public void sendWhatsApp() {
		try {
			String phone = "60197231577";
			String msg = "Hai saya nak tanyfgdfgfdga pasal rrrproduk: " + "name";

			String link = "https://wa.me/" + phone +
					"?text=" + URLEncoder.encode(msg, "UTF-8");

			Desktop.getDesktop().browse(new URI(link));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
