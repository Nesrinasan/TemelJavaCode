import java.io.* ; 
import java.util.* ; 
public class Stack1 
{
    double x = 0 ; 
    public Stack1()
    {

    }
    public void test1()
    {
	ArrayList arr = new ArrayList () ; 
	long d = 200000000 ; 
	for (int i=1 ; i<d; i++) 
	{
	    x++ ; 
	    String s = new String ("asdfasdfasdfasdfasdfasdfasdfasdf") ; 
	    arr.add (s) ; 
	}
	test1()  ; 
	arr.get(1) ; 
    }
	public static void main(String args[]) 
	{
	    Stack1 s = new Stack1() ; 
	    s.test1() ; 

	}
}


