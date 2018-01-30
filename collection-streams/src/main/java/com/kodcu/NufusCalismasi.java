
import java.util.ArrayList;
import java.util.Iterator;


class NufusBilgisi {
    
    private String ad;
    private String soyad;
    private int yas;
    
    public NufusBilgisi(String ad, String soyad, int yas) {
	this.ad = ad ; 
	this.soyad = soyad; 
	this.yas = yas ;
    }

    public String adNedir() {
	return ad;
    }

    public String soyadNedir() {
	return soyad;
    }

    public int yasNedir() {
	return yas;
    }

}

public class NufusCalismasi {

    public static void main(String args[]) {
    
	    NufusBilgisi n1 = new NufusBilgisi("Mehmet", "Dinc", 25);
	    NufusBilgisi n2 = new NufusBilgisi("Kaya","Alp", 24);
	    NufusBilgisi n3 = new NufusBilgisi("Osman","Ay", 25);
	    NufusBilgisi n4 = new NufusBilgisi("Ahmet","Uzun", 25);

	    ArrayList al = new ArrayList();
	    al.add(n1);
	    al.add(n2);
	    al.add(n3);
	    al.add(n4);
	    al.add(4,new NufusBilgisi("Selami","Nice",30));
        // al.addAll(al);

	    for (int i=0; i<al.size(); i++) {
		NufusBilgisi n = (NufusBilgisi) al.get(i); // dikkat
		System.out.println("Ad:" + n.adNedir() +
				   " Soyad:"+ n.soyadNedir() +
				   " Yas:" + n.yasNedir() );
	    }
	    
	    System.out.println("--Iterator nesnesi kullanilarak--");
	    // Iterator nesnesi kullanilarak
	    Iterator iterator = al.iterator();
	    while (iterator.hasNext()) {
		NufusBilgisi n = (NufusBilgisi) iterator.next(); // dikkat
		System.out.println("Ad:" + n.adNedir() + 
				   " Soyad: "+ n.soyadNedir() +
				   " Yas: " + n.yasNedir() );
	    }
    }
}
