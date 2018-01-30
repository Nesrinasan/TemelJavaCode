package com.kodcu;

public class Musteri {

	private double bakiye ;
	private String musteriAdi;

	public Musteri(String ad, double miktar) {
		bakiye = miktar;
		musteriAdi = ad ;
	}

	public void bakiyeGuncelle(double miktar) {
		bakiye += miktar;
	}

	public double bakiyeOgren() {
		return bakiye;
	}

	public String toString() {
		return musteriAdi;
	}


}
