
class MuzikDosyasi {
    String m_tur = "Muzik Dosyasi" ;
}

class ResimDosyasi {
    String r_tur = "Resim Dosyasi" ;
}

class TextDosyasi {
    String t_tur = "Text Dosyasi" ;
}

public class MetodOverloadingDemo1 {

    public void dosyaAc(MuzikDosyasi md) {
	System.out.println( "Tur =" + md.m_tur );
    }

    public void dosyaAc(ResimDosyasi rd) {
	System.out.println( "Tur =" + rd.r_tur );
    }

    public void dosyaAc(TextDosyasi td) {
	System.out.println( "Tur =" + td.t_tur );
    }

    public static void main(String[] args) { 
	      MetodOverloadingDemo1 mod1 = new MetodOverloadingDemo1();
	      MuzikDosyasi  md = new MuzikDosyasi();	
	      ResimDosyasi  rd = new ResimDosyasi();	
	      TextDosyasi   td = new TextDosyasi();
	      mod1.dosyaAc(md);
	      mod1.dosyaAc(rd);
	      mod1.dosyaAc(td);

    }
}
