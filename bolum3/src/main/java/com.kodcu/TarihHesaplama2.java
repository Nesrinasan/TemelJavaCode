public class TarihHesaplama2 {

    int gun , ay , yil ;

    public void gunEkle(int gun) {
         gun += gun ;
    }
    
    public void gunuEkranaBas() {
	System.out.println("Gun = " + gun);
    }
    
    public static void main(String[] args) {
	TarihHesaplama2 th = new TarihHesaplama2();
	th.gunEkle(2);
	th.gunEkle(3);
	th.gunuEkranaBas();
    }
}


