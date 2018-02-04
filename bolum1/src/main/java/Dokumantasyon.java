

/**
 * @author rahman usta
 * @see java.lang.String
 * @since 10.10.2010
 * @version 1.6
 */
public class Dokumantasyon {

    /**
     * Merhaba yazisini tutan degisken.
     */
    private String merhaba="Merhaba ";
    public String mesaj;

    /**
     * Bu metod calistiginde <em>Merhaba Dunya</em> geri dondurulur.
     * @param str <em>Dunya..</em> ifadesini alir.
     * @return Merhaba Dunya dondurur
     */
    public String calis(String str){
        return (merhaba+str);
    }

    /**
     * Dokumantasyon orneginin giris noktasi.
     * @param args disaridan girilen parametreler dizisi.
     * <em>Merhaba Dunya</em> mesajini ekrana basar.
     * */
    public static void main(String[] args) {
        String mesaj=new Dokumantasyon().calis("Dunya..");
        System.out.println(mesaj);
    }
}
