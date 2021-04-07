package day05;

import java.util.ArrayList;
import java.util.List;

public class OgrenciIsleri {
	/*
    *
    * OgrenciIsleri adinda bir class olusturun Ogrenci kayit, ogrenci goruntuleme,
    * ogrenci silme ve cikis methodlari olusturun bu methodlari main methodda cagirin.
    *
    */
	
	public static List<String> ogrenciler=new ArrayList<>();
	
	
	public static void main(String[] args) {
		
}
	public static void menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hangi islemi yapmak istersiniz \n1:Ogrenci Kayit\n2:Ogrenci Goruntuleme\n3:Ogrenci Silme"
				+ "\n4:Cikis");
		int secim = scan.nextInt();
		
		switch(secim) {
		case 1:
			ogrenciKayit();
			break;
		case 2:
			ogrenciGoruntuleme();
			break;
		case 3:
			ogrenciSilme();
			break;
		case 4:
			cikis();
			break;
		default:
			System.out.println("Yanlis giris yaptiniz");
		}
			
		}
	
	
	public static void ogrenciKayit() {
		System.out.println("Lutfen sirasiyla ogrenci numarasini,adini soyadini, ve ortalamasini giriniz");
	}
	
	public static void ogrenciGoruntuleme() {
		
	}
	
	public static void ogrenciSilme() {
		
	}
​
	public static void cikis() {
		
	}
	
}

