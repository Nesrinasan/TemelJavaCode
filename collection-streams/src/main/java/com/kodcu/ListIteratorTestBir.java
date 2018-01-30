
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorTestBir {

    public static void main(String args[]) {
    
	    String s1 = "bir";
	    String s2 = "iki";
	    String s3 = "uc";
	    String s4 = "dort";
	    String s5 = "bes";
	    

	    ArrayList sayilar = new ArrayList();
	    sayilar.add(s1);
	    sayilar.add(s2);
	    sayilar.add(s3);
	    sayilar.add(s4);
	    sayilar.add(s5);
	    
	    
	    ListIterator listIterator = sayilar.listIterator(); // dikkat
	    while (listIterator.hasNext()) {
		String sayi = (String) listIterator.next(); // dikkat
		System.out.println(" --> : " + sayi);
		if (sayi.equals("bes")) {
		    listIterator.set("bes bes bes");
		}
	    }
	    
	    // sondan basa dogru sayma
	    System.out.println("sondan basa dogru sayma");
	    while (listIterator.hasPrevious()) {
		String sayi = (String) listIterator.previous(); // dikkat
		System.out.println(" --> : " + sayi);
		
	    }
    }
}


