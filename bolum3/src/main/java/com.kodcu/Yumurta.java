
public class Yumurta {
  int toplam_yumurta_sayisi = 9;
  
  Yumurta sepeteKoy() {
    toplam_yumurta_sayisi++;
    return this;
  }
  
  void goster() {
    System.out.println("toplam_yumurta_sayisi = "
            + toplam_yumurta_sayisi);
  }
  
  public static void main(String[] args) {
    new Yumurta().goster(); //1


    Yumurta y = new Yumurta(); // 2
    y.goster();

  }
} 

