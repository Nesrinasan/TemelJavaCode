package elektrik;

import com.sun.xml.internal.ws.assembler.jaxws.MustUnderstandTubeFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MainTest {


    private static List<Musteri> musteriList = Arrays.asList(
            new Musteri(1000, "Erenkoy"),
            new Musteri(750, "Kadikoy"),
            new Musteri(100, "Maslak"),
            new Musteri(2000, "Besiktas"),
            new Musteri(150, "Merter"),
            new Musteri(3500, "Atasehir"),
            new Musteri(1291, "Mecisiyekoy")
    );


    @Test
    public void binTLAltindaOdemeTest() {

        // given  - musteri list

        // when

        List<Musteri> sinirinAltindaKalanMusteriler =
                MusteriUtil.binTlAltindaKalanlar(musteriList);


        // then

        Assert.assertEquals(sinirinAltindaKalanMusteriler.size(), 3 );
    }

    @Test
    public void binErenkoyOturanTest() {

        // given  - musteri list

        // when

        List<Musteri> sinirinAltindaKalanMusteriler =
                MusteriUtil.erenkoyOturanlar(musteriList);


        // then

        Assert.assertEquals(sinirinAltindaKalanMusteriler.size(), 1 );
    }

    @Test
    public void filterTest() {

        // given  - musteri list

        // when

        List<Musteri> sinirinAltindaKalanMusteriler =
                MusteriUtil.filter(new ErenkoydeOturanlarKurali(), musteriList);


        // then

        Assert.assertEquals(sinirinAltindaKalanMusteriler.size(), 1 );


        // when

        sinirinAltindaKalanMusteriler =
                MusteriUtil.filter(new IkibinTLodeneyenlerveBesiktasOturanlarKurali(), musteriList);

        // then

        Assert.assertEquals(sinirinAltindaKalanMusteriler.size(), 1 );

        // when

        sinirinAltindaKalanMusteriler =
                MusteriUtil.filter(new BesYuzilebinArasindakilerKurali(), musteriList);

        // then

        Assert.assertEquals(sinirinAltindaKalanMusteriler.size(), 1 );


    }


    @Test
    public void isimsizTest() {

        // given  - musteri list

        // when

        // when

        List<Musteri> sinirinAltindaKalanMusteriler  =
                MusteriUtil.filter(new Kural() {
                    @Override
                    public boolean uygula(Musteri musteri) {
                        if (musteri.getBorc()> 500 ) {
                            return true;
                        }
                        return false ;
                    }
                }, musteriList);

        // then

        Assert.assertEquals(sinirinAltindaKalanMusteriler.size(), 5 );
    }
}
