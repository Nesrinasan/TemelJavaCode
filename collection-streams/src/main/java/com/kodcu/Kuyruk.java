

import java.util.LinkedList;


public class Kuyruk {

    private LinkedList torba = new LinkedList();

    public void veriAt(Object o) {
	torba.addFirst(o);
    }
    
    public Object veriCek() {
	return torba.removeLast();
    }


    public static void main(String[] args) {
	
	String u1 = "Turkiye" ; 
	String u2 = "Japonya" ; 
	String u3 = "Almanya" ; 
	
	Kuyruk k = new Kuyruk();
	k.veriAt(u3);
	k.veriAt(u2);
	System.out.println(" --> " + k.veriCek());
	k.veriAt(u1);
	System.out.println(" --> " + k.veriCek());
    }
}




