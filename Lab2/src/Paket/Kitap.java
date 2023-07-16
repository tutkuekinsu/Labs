package Paket;

public class Kitap extends Item{
	
	public Kitap(String isim, String kitapYazari, int kitapYili, int sayfaSayisi) {
		super(isim);
		this.kitapYazari=kitapYazari;
		this.kitapYili=kitapYili;
		this.sayfaSayisi=sayfaSayisi;
		this.kitapUcreti= (float) ((sayfaSayisi*3.5)/60);	
	}
	
	public int sayfaSayisi;
	public String kitapYazari;
	public int kitapYili;
	private float kitapUcreti;
	

	
	
	public float getkitapUcreti() {
		return kitapUcreti;
	}
}
