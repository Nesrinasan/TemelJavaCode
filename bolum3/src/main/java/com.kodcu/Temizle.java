class AmasyaElmasi {

	int i = 0 ;
	AmasyaElmasi(int y) {
		this.i = y ;
		System.out.println("AmasyaElmasi Nesnesi Olusturuluyor = " + i );
	}

	public void finalize() {
		System.out.println("AmasyaElmasi Nesnesi Yok Ediliyor = "+ i );
	} 
}

public class Temizle {

	public static void main(String args[]) {
		for (int y=0 ; y<10 ;y++) {
			AmasyaElmasi e = new AmasyaElmasi(y);
		}

		for (int y=10 ; y<21 ;y++) {
			AmasyaElmasi e = new AmasyaElmasi(y);
		}
	}
}

