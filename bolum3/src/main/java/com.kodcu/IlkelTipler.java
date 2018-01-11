package com.kodcu;

public class  IlkelTipler {

  boolean mantiksal_deger;
  char krakter_deger;
  byte byter_deger;
  short short_deger;
  int int_deger;
  long long_deger;
  float float_deger;
  double double_deger;
  
  public static void ekranaBas(IlkelTipler ilkelTipler) {
     System.out.println("Veri Tipleri   Ilk Degerleri");
     System.out.println("boolean        " + ilkelTipler.mantiksal_deger );
     System.out.println("char           " + ilkelTipler.krakter_deger);
     System.out.println("byte           " + ilkelTipler.byter_deger );
     System.out.println("short          " + ilkelTipler.short_deger );
     System.out.println("int            " + ilkelTipler.int_deger );
     System.out.println("long           " + ilkelTipler.long_deger );
     System.out.println("float          " + ilkelTipler.float_deger );
     System.out.println("double         " + ilkelTipler.double_deger);
  }

  public static void main(String args[]) {

      ekranaBas(new IlkelTipler());
	/*     
	       // yukaridaki ifade yerine 
	       // asagidaki ifadeyi de kullanabilirsiniz.
	       IlkelTipler it = new IlkelTipler();
	       it.ekranaBas();
	*/
  }
}

