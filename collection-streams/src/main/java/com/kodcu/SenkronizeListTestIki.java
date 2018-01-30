

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

class Yerlestirici2 extends Thread {

	private List torba ;

	private Double eleman[] = { new Double(0.0),
		new Double(1.0),
		new Double(2.0),
		new Double(3.0),
		new Double(4.0),
		new Double(5.0)}; 

	public Yerlestirici2(List torba) {
		this.torba = torba ;
	}

	public void run() {
		for (int i=0; i<eleman.length; i++) {
			torba.add(eleman[i]);
			System.out.println(eleman[i] +" torbaya atildi");
		}
	}
}

class Alici2 extends Thread {

	private List torba ;

	public Alici2(List torba) {
		this.torba = torba ;
	}

	public void run() {

		int sayac = 0;
		while (true) {

			Double dNsn = null ; 
			try {
				dNsn = (Double)torba.get(sayac);
			} catch (IndexOutOfBoundsException ex) {}


			if (dNsn != null) {
				System.out.println(dNsn + " torbadan cekildi");
				sayac++;
			}

			if (sayac == 6) {
				System.out.println("torbanin icerisindeki tum elemanlar cekildi");
				break;
			}
		}
	}
}


public class SenkronizeListTestIki{

	public static void main(String args[]) {
		
		ArrayList torbax = new ArrayList();
		List torba = Collections.synchronizedList(torbax); // dikkat

		Yerlestirici2 y2 = new Yerlestirici2(torba);
		Alici2 a2 = new Alici2(torba);

		a2.start();
		y2.start();
	}
}



