package Paket;

public class Oyku extends Kitap{
	
	public Oyku(String isim, String kitapYazari, String tur, int kitapYili, int sayfaSayisi) {
		super(isim,kitapYazari,kitapYili,sayfaSayisi);
		this.tur=tur;
	}

}
