package com.kodcu;

import com.kodcu.util.Makine;


public class UstaBasi {

    public UstaBasi() {
	Makine m = new Makine();
	//int devir_sayisi = m.devir_sayisi ; ! Hata ! erisemez
	m.degerAta(6);
	int devir_sayisi = m.degerAl();
	String model = m.model;
	// m.calis() ; ! Hata ! erisemez
    }
}

