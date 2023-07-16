package Paket;

public class Film extends Item{
	private int filmSuresi;
	public int filmBiletUcreti;
	public int filmYili;
	public String filmYonetmeni;
	
	
	public Film(String isim,String filmYonetmeni,int filmYili,int filmSuresi){
		super(isim);
		this.filmYonetmeni=filmYonetmeni;
		this.filmYili=filmYili;
		this.filmSuresi=filmSuresi;
		if(filmYili>2012)
		{
			for(int i=2021,j=50; i>2012;i--, j-=5) {
				if(i==filmYili)
					this.filmBiletUcreti=j;
			}
		}
		else
			this.filmBiletUcreti=10;
	}
	
	public int getfilmsuresi() {
		return filmSuresi;
	}

}
