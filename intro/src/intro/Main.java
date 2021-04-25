package intro;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// camelCase
		// Don't repeat yourself
		String internetSubeButonu = "Ýnternet Þubeye gir";

		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		int vade = 36;
		boolean dustuMu = false;

		if (dolarBugun < dolarDun) {
			System.out.println("Dolar düþtü iconu");
		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar yükseldi iconu");
		} else {
			System.out.println("Dolar eþittir iconu");
		}

		String[] krediler = 
			{ 
				"Hýzlý Kredi", 
				"Mutlu Emekli Kredisi", 
				"Konut Kredisi", 
				"Çiftçi Kredisi", 
				"Msb Kredisi",
				"Meb Kredisi"
			};
		
		// foreach
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		

	}

}
