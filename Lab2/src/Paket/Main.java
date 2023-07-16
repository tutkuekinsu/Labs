package Paket;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Item item[] =new Item[5];
		item[0]=new Roman("Animal Farm","George Orwell","Roman", 1945,320);
		item[1]=new Oyku("Alice's Adventures in Wonderland","Lewis Carroll","Oyku",1865,112);
		item[2]=new BilimKurgu("Interstellar", "Christopher Nolan", "Bilim Kurgu", 2020, 169);
		item[3]=new Drama("The Terminal", "Steven Spielberg"," Drama", 2004, 128);
		
		
		
		
			for (int i = 0; i <= 3; i++) {
			    
				if (item[i] instanceof Kitap) {
			        Kitap kitap = (Kitap) item[i];
			        System.out.println(kitap.isim + ", " + kitap.kitapYazari+ ", " + kitap.tur+ "," + kitap.kitapYili+","+kitap.sayfaSayisi+","+kitap.getkitapUcreti());
			    }
				

				else if (item[i] instanceof Film) {
			        Film film = (Film) item[i];
			        System.out.println(film.isim + ", " + film.filmYonetmeni+ ", " + film.tur+ "," + film.filmYili+","+film.getfilmsuresi()+","+ film.filmBiletUcreti);
			    }
			}
		
		
		item[1]=null;
		item[2]=null;
		
		for(int i=0; i<=3;i++) {
			if(item[i]!=null) {
				if (item[i] instanceof Kitap) {
			        Kitap kitap = (Kitap) item[i];
			        System.out.println(kitap.isim + ", " + kitap.kitapYazari+ ", " + kitap.tur+ "," + kitap.kitapYili+","+kitap.sayfaSayisi+","+kitap.getkitapUcreti());
			    }
				

				else if (item[i] instanceof Film) {
			        Film film = (Film) item[i];
			        System.out.println(film.isim + ", " + film.filmYonetmeni+ ", " + film.tur+ "," + film.filmYili+","+film.getfilmsuresi()+","+ film.filmBiletUcreti);
			    }
			}
			
				
				
			}
		
		item[4]=new Drama("Schindler's List", "Steven Spielberg", "Drama", 1994, 187);
		for(int i=0; i<=4;i++) {
			if(item[i]!=null) {
				if (item[i] instanceof Kitap) {
			        Kitap kitap = (Kitap) item[i];
			        System.out.println(kitap.isim + ", " + kitap.kitapYazari+ ", " + kitap.tur+ "," + kitap.kitapYili+","+kitap.sayfaSayisi+","+kitap.getkitapUcreti());
			    }
				

				else if (item[i] instanceof Film) {
			        Film film = (Film) item[i];
			        System.out.println(film.isim + ", " + film.filmYonetmeni+ ", " + film.tur+ "," + film.filmYili+","+film.getfilmsuresi()+","+ film.filmBiletUcreti);
			    }
			}
			
}
}
}