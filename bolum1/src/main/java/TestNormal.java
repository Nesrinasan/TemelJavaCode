public class TestNormal {
	
	public void uyariYap() {
		System.out.println("Dikkat Dikkat");
	}

	public void git(){
		//tn.uyariYap();
			
	}

	public static void main(String args[]) {
		TestNormal ahmet = new TestNormal() ;
		TestNormal tn = new TestNormal() ;
		ahmet.git();
		//tn.uyariYap();
	}
}


 class Deneme {
	
	public void kos() {
		System.out.println("kos kos");
	}

	public static void main(String args[]) {
		TestNormal tn = new TestNormal() ;
		tn.uyariYap();
	}
}