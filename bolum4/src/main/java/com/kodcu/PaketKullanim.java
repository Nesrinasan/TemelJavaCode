package com.kodcu;

import java.io.*;

public class PaketKullanim {

    public static void main(String args[]) throws IOException{
		BufferedReader  sf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Bilgi Giriniz : ");
		String bilgi = sf.readLine();
		System.out.println("bilgi --> " + bilgi);
    }
}
