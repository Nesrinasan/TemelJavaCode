package com.kodcu;

public class FirlatimOrnek3 {

	public int basla(int a, int b) throws Exception {
		int sonuc = 0 ;
		Exception globalEx = null ;
		try {
			sonuc = a / b ;
		} catch(Exception ex) {
			System.out.println("basla() istisna yakalandi");
			globalEx = ex ; // aktarim
		} finally {
			System.out.println("sonuc : "+ sonuc);
			if(globalEx != null) { // eger istisna olusmus ise
			    throw globalEx ; // tekrardan firlatim
			}
			return sonuc ;  // degeri geri dondur
		}
	}

	public static void main(String args[]) {
		try {
			FirlatimOrnek3 fo3 = new FirlatimOrnek3();
			fo3.basla(1,1);
			fo3.basla(1,0);
		} catch(Exception ex) {
			System.out.println("main() istisna yakalandi");
		}
	}
}
