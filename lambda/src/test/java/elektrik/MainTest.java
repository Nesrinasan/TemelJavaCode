package elektrik;

import com.sun.xml.internal.ws.assembler.jaxws.MustUnderstandTubeFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;

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

        List<Musteri> sinirinAltindaKalanMusteriler  =
                MusteriUtil.filter(new Kural() {
                    @Override
                    public boolean uygula(Musteri musteri, Musteri musteri2) {
                       return  musteri.getBorc()> 500 ;
                    }
                }, musteriList);

        // then

        Assert.assertEquals(sinirinAltindaKalanMusteriler.size(), 5 );
    }

    @Test
    public void lambdaTest() {

        // given  - musteri list

        // when

        List<Musteri> sinirinAltindaKalanMusteriler  =
                MusteriUtil.filter( (musteri, musteri2) ->
                        musteri.getBorc()> 500 , musteriList);

        // then

        Assert.assertEquals(sinirinAltindaKalanMusteriler.size(), 5 );
    }


    @Test
    public void lambdaTemel() {

        Function<Integer, Integer> f = (x) -> x + 1 ;
        Function<Integer, Integer> g = (x) -> x * 2 ;

        int result = f.apply(1) ;
        Assert.assertEquals(2, result);

        int resultOfG = g.apply(2);
        Assert.assertEquals(4, resultOfG);

        int resultAng = f.andThen(g).apply(1) ;
        Assert.assertEquals(4, resultAng);

        int resultCompose =  f.compose(g).apply(1) ;
        Assert.assertEquals(3, resultCompose);

        BiFunction<Integer, Integer, Integer> fx = (x, y) -> x + y + 1 ;
        fx.apply(1,3);

    }

    @Test
    public void lambdaVeStream() {

       List<Musteri> sonuc =
               musteriList.stream().filter( musteri -> musteri.getBorc()> 1000).
                       collect(Collectors.toList());

        Assert.assertEquals(3, sonuc.size());

    }

    @Test
    public void predicateTest() {

        Predicate<Musteri> predicate1 = musteri -> musteri.getBorc()> 1000;
        Predicate<Musteri> predicate2 = musteri -> musteri.getSemt().
                equalsIgnoreCase("Besiktas");

        Predicate<Musteri> predicate3  = predicate1.and(predicate2);

        List<Musteri> sonuc = MusteriUtil.filterPredicate(predicate3, musteriList);

        Assert.assertEquals(1, sonuc.size());

    }

    @Test
    public void functionTest() {


        List<Musteri> sonuc =
                MusteriUtil.filterFunction(musteri -> musteri.getBorc()> 1000,
                        musteriList);

        Assert.assertEquals(3, sonuc.size());

    }

    @Test
    public void siralaTest() {



        //musteriList.sort(comparing(musteri -> musteri.getBorc()));
        musteriList.sort(comparing(Musteri::getBorc).reversed());

        Assert.assertEquals("Atasehir", musteriList.get(0).getSemt());


        Consumer<Musteri> musteriConsumer = (musteri) -> System.out.println(" *** " +
                musteri.getBorc());

        musteriConsumer.accept(new Musteri(1, "Bebek"));

        Supplier<List<Musteri>> musteriSupplier = ()  -> {
           return Arrays.asList(
                   new Musteri(1 , "Bebek"),
                   new Musteri(2 , "Kazasker"),
                   new Musteri(3 , "Sariyer"));

        };


        List<Musteri> musteriList = musteriSupplier.get();

        musteriList.forEach(musteriConsumer);

        Stream<List<Musteri>> listOfMusteri = Stream.generate(musteriSupplier);







    }
}
