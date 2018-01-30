

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Collections;

class Robot778 extends Thread {

	private List torba ;

	private Integer eleman[] = { new Integer(0),
		new Integer(1),
		new Integer(2),
		new Integer(3),
		new Integer(4),
		new Integer(5)}; 

	public Robot778(List torba) {
		this.torba = torba ;
	}

	public void run() {
		try {

			synchronized(torba) {

				for (int i=0; i<eleman.length; i++) {
					sleep(10); 
					torba.add(eleman[i]);
				}

				// torbaya attiklarimiza bakalim
				Iterator iterator = torba.iterator();
				while (iterator.hasNext()) {
					System.out.println(this.getName()+" --> " + iterator.next());
				}
			}
		} catch (Exception ex) {
			System.err.println("Robot778 hata : " +  ex);
		}
	}
}



class Robot333 extends Thread {

	private List torba ;

	private Integer uyeler[] = { new Integer(6),
		new Integer(7),
		new Integer(8),
		new Integer(9),
		new Integer(10),
		new Integer(11)}; 

	public Robot333(List torba) {
		this.torba = torba ;
	}

	public void run() {
		try {

			synchronized(torba) {
				for (int i=0; i<uyeler.length; i++) {
					sleep(10); 
					torba.add(uyeler[i]);
				}
				// torbaya attiklarimiza bakalim
				Iterator iterator = torba.iterator();
				while (iterator.hasNext()) {
					System.out.println(this.getName()+" --> " + iterator.next());
				}
			}
		} catch (Exception ex) {
			System.err.println("Robot333 hata : " +  ex);
		}
	}
}


public class SenkronizeTestBir {

	public static void main(String args[]) {
		ArrayList torba = new ArrayList();

		//List torba = Collections.synchronizedList(al);

		Robot778 r778 = new Robot778(torba);
		Robot333 r333 = new Robot333(torba);

		r778.start();
		r333.start();

	}
}

