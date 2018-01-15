package com.kodcu;

interface A1 {
    public void hesapla();  
}

interface A2 {
    public void hesapla(int d); 
}

interface A3 {
    public int hesapla();
}

class S1 implements A1,A2 { // sorunsuz
    public void hesapla() { //adas metodlar(overloaded)
	System.out.println("S1.hesapla");
    }
    public void hesapla(int d) { //adas metodlar(overloaded)
	System.out.println("S1.hesapla " + d );
    }
}

/* 
! Hatali !, adas metodlar (overloaded)
donus tiplerine gore ayirt edilemez
*/

/*
class S2 implements A1,A3 {


    public void hesapla() {
	    System.out.println("S2.hesapla");
    }

    

    public int hesapla() {
	System.out.println("S2.hesapla");
	    return 123;
    } 

}

*/
