class YeniKahveFincani {
  public YeniKahveFincani(int adet ) { 
      System.out.println(adet + " adet YeniKahveFincani");
  }

}

public class YapilandirciBasitOrnekVersiyon2 {

  public static void main(String[] args) {
    for(int i = 0; i < 10; i++) 
      new YeniKahveFincani( i ); 
     }
} 


