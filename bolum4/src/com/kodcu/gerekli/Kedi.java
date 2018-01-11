package com.kodcu.gerekli;
import com.kodcu.util.*;    
public class Kedi  extends Hayvan {
    
    public Kedi() {
	System.out.println("Kedi olusturuluyor");
	System.out.println(a);
	// System.out.println(b); // ! Hata ! erisemez
	// System.out.println(c); // ! Hata ! erisemez
	System.out.println(d);
	avlan();
	// kos(); // ! Hata ! erisemez
	// sesCikart(); // ! Hata ! erisemez
	zipla();
    }  

    public static void main(String args[]) {
	Kedi k = new Kedi();
    }
}

