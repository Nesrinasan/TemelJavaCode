package com.kodcu.util;
public class Hayvan {

	protected String a = "Hayvan.a";
	String b = "Hayvan.b"; //friendly
	private String c = "Hayvan.c";
	public String  d = "Hayvan.d"; 

	protected void avlan() {
	    System.out.println("Hayvan.avlan()");
	}

	void kos() { //friendly 
	    System.out.println("Hayvan.kos()");
	}

	private void sesCikart() {
	    System.out.println("Hayvan.sesCikart()");
	}

	public void zipla() {
	    System.out.println("Hayvan.zipla()");
	}
}

