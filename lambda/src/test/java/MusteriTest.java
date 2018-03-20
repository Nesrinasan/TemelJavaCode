import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class MusteriTest {

    static List<Musteri> musteriList  = Arrays.asList(

            new Musteri(2000, "Erenkoy", Arrays.asList(new Fatura(1000, "2018-01-30"), new Fatura(1000, "2018-02-30"))),
            new Musteri(990, "Kazasker",Arrays.asList(new Fatura(1000, "2018-01-30"), new Fatura(1000, "2018-02-30"))),
            new Musteri(1200, "Kadikoy",Arrays.asList(new Fatura(1000, "2018-01-30"), new Fatura(1000, "2018-02-30"))),
            new Musteri(200, "Maslak",Arrays.asList(new Fatura(1000, "2018-01-30"), new Fatura(1000, "2018-02-30"))) ,
            new Musteri(1750, "Atasehir", Arrays.asList(new Fatura(1000, "2018-01-30"), new Fatura(1000, "2018-02-30")))

            );

    @Test
    public void testErenkoy() {

        // given
        // musterli list


        // when
        List<Musteri> sonuc = MusteriUtil.filterByErenkoy(musteriList);

        // then
        Assert.assertEquals(1, sonuc.size());



    }

    @Test
    public void testBinVeUzeri() {

        // given
        // musterli list


        // when
        List<Musteri> sonuc = MusteriUtil.filterByBinVeUzeri(musteriList);

        // then
        Assert.assertEquals(3, sonuc.size());

    }

    @Test
    public void testGeneric() {

        // given
        // musterli list


        // when
        List<Musteri> sonuc = MusteriUtil.filter(new ErenkoyKurali(), musteriList);

        // then
        Assert.assertEquals(1, sonuc.size());


        // when
        List<Musteri> sonuc2 = MusteriUtil.filter(new BinVeUzeriKurali(), musteriList);

        // then
        Assert.assertEquals(3, sonuc2.size());



    }

    @Test
    public void testInnerClass() {

        // given
        // musterli list


        // when
        List<Musteri> sonuc = MusteriUtil.filter(new Kural() {
            @Override
            public boolean uygulama(Musteri musteri) {
                if ("kazasker".equalsIgnoreCase(musteri.getSemt())) {
                    return true;
                }
                return false;
            }
        }, musteriList);

        // then
        Assert.assertEquals(1, sonuc.size());

    }

    @Test
    public void testLambda() {

        // given
        // musterli list


        // when
        List<Musteri> sonuc = MusteriUtil.filter( musteri -> "erenkoy".equalsIgnoreCase(musteri.getSemt()), musteriList);

        // then
        Assert.assertEquals(1, sonuc.size());


    }

    @Test
    public void testLambdaBasics() {

        // given
        Function<Integer, Integer> f = (x) -> x + 1 ;
        Function<Integer, Integer> g = (x) -> x * 2 ;


        // when
        int sonuc = f.apply(1) ;

        // then
        System.out.println(sonuc);

        // when
        sonuc = f.andThen(g).apply(1) ;

        // then
        System.out.println(sonuc);

        // when
        sonuc = f.compose(g).apply(1) ;

        // then
        System.out.println(sonuc);
    }

    @Test
    public void testLambdaAdvance() {

        // given
        BiFunction<Integer, Integer, Integer> f = (x, y ) -> x + y +  1;
        Function<Integer, Integer> g = (x) -> x * 2;

        // when
        int sonuc = f.apply(3, 4 ) ;

        // then
       Assert.assertEquals(8, sonuc);

    }

    @Test
    public void testLambdaPredicate() {

        // given
        // musterli list


        // when

        Predicate<Musteri> erenkoyKurali  = musteri -> "erenkoy".equalsIgnoreCase(musteri.getSemt());
        Predicate<Musteri> binTLAzKurali  = musteri ->  musteri.getBorc() < 1000 ;
        Predicate<Musteri> yeniKural = erenkoyKurali.or(binTLAzKurali);

        List<Musteri> sonuc = MusteriUtil.filterPrediate( yeniKural, musteriList);

        // then
        Assert.assertEquals(3, sonuc.size());


    }

    @Test
    public void testLambdaFunction() {

        // given
        // musterli list


        // when

        Predicate<Musteri> erenkoyKurali  = musteri -> "erenkoy".equalsIgnoreCase(musteri.getSemt());
        Predicate<Musteri> binTLAzKurali  = musteri ->  musteri.getBorc() < 1000 ;
        Predicate<Musteri> yeniKural = erenkoyKurali.or(binTLAzKurali);

        List<Musteri> sonuc = MusteriUtil.filterFunction( musteri -> "erenkoy".equalsIgnoreCase(musteri.getSemt()), musteriList);

        // then
        Assert.assertEquals(1, sonuc.size());


    }

}
