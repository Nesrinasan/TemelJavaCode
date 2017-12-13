
public class ToplamaIslemi { 

    public static void main(String args[]) {

	if (args.length < 2) {
	    System.out.println("Ltf iki adet sayi giriniz");
	    System.exit(-1); // uygulama sonlanacaktir
	}

	double a = Double.parseDouble(args[0]);
	double b = Double.parseDouble(args[1]);

	double sonuc = Toplama.topla(a,b); // dikkat 
	System.out.println("Sonuc : " + sonuc );
    }
}
