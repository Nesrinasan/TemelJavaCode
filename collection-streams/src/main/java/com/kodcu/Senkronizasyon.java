

import java.util.*;

public class Senkronizasyon  {
  public static void main(String[] args) {
    
    Collection c = Collections.synchronizedCollection(new ArrayList());
    
    List list = Collections.synchronizedList(new ArrayList());
    List list2 = Collections.synchronizedList(new LinkedList());

    Set s = Collections.synchronizedSet(new HashSet());
    Set sSirali = Collections.synchronizedSortedSet(new TreeSet());
    
    Map m = Collections.synchronizedMap(new HashMap());

    Map mSirali = Collections.synchronizedSortedMap(new TreeMap());
  }
} 
