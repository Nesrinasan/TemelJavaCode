

public class YordamOverloadingDemo2x {

    public int toplamaYap(int a , int b){
	int sonuc = a + b ;
	System.out.println("sonuc - 1  = " + sonuc);
	return sonuc ;
    }

    public void  toplamaYap(int a , double b){
	double sonuc = a + b ;
	System.out.println("sonuc - 2 = " + sonuc);
    }

    public double  toplamaYap(double a , int b){
	double sonuc = a + b ;
	System.out.println("sonuc - 3= " + sonuc);
	return sonuc ;
    }

    public static void main(String[] args) { 
	      YordamOverloadingDemo2 mod2 = new YordamOverloadingDemo2();
	      mod2.toplamaYap(3,4);
	      mod2.toplamaYap(3,5.5);
	      mod2.toplamaYap(6.8,4);
    }
}
