
package com.kodcu;

class KahveFincani {

  public KahveFincani() { // yapilancirici metod / constractor method
    System.out.println("KahveFincani..");
    
  }

}

public class YapilandirciBasitOrnek {

  public static void main(String[] aaaaa) {
    for(int i = 0; i < 10; i++) 
      new KahveFincani(); 
     }
} 


