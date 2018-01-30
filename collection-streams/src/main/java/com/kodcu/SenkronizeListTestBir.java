

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

class Yerlestirici extends Thread {

	private List torba ;

	private Integer eleman[] = { new Integer(0),
		new Integer(1),
		new Integer(2),
		new Integer(3),
		new Integer(4),
		new Integer(5)}; 

	public Yerlestirici(List torba) {
		this.torba = torba ;
	}

	public void run() {
		for (int i=0; i<eleman.length; i++) {
			torba.add(eleman[i]);
			System.out.println(eleman[i] +" torbaya atildi");
		}
	}
}

class Alici extends Thread {

	private List torba ;

	public Alici(List torba) {
		this.torba = torba ;
	}

	public void run() {

		int sayac = 0;
		while (true) {

			Integer iNsn = null ; 
			try {
				iNsn = (Integer)torba.get(sayac);
			} catch (IndexOutOfBoundsException ex) {}


			if (iNsn != null) {
				System.out.println(iNsn + " torbadan cekildi");
				sayac++;
			}

			if (sayac == 6) {
				System.out.println("torbanin icerisindeki tum elemanlar cekildi");
				break;
			}
		}
	}
}


public class SenkronizeListTestBir {

	public static void main(String args[]) {
		ArrayList torba = new ArrayList();

		//List torba = Collections.synchronizedList(torbax);

		Yerlestirici y = new Yerlestirici(torba);
		Alici a = new Alici(torba);

		a.start();
		y.start();
	}
}


