package com.kodcu;

public class HeapGosterim {

	public static void main(String args[]) throws InterruptedException{
		for (long y=0 ; y<1000000 ;y++) {
			new String("Yer Kaplamak icin");
			new String("Yer Kaplamak icin");
			new String("Yer Kaplamak icin");
			
		}
		System.gc();
	}
}

