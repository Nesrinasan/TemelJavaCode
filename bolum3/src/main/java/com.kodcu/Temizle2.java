class Elma2 {

	int i = 0 ;
	Elma2(int y) {
		this.i = y ;
		System.out.println("Elma2 Nesnesi Olusturuluyor = " + i );       
	}

	public void finalize() {
		System.out.println("Elma2 Nesnesi Yok Ediliyor =  "+ i );
	} 
}

public class Temizle2 {

	public static void main(String args[]) {
		for (int y=0 ; y<10 ;y++) {
			Elma2 e = new Elma2(y);
		}
		System.gc() ; // Cop toplayaciyici tetikle
		for (int y=10 ; y<21 ;y++) {
			Elma2 e = new Elma2(y);
		}
	}
}

