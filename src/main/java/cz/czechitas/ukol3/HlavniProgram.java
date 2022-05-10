package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {

        System.out.println("Informace o iMarketa PC:");
        Pocitac imarketaPocitac;
        imarketaPocitac = new Pocitac();
        System.out.println(imarketaPocitac);
        imarketaPocitac.zapniSe();

        //"Počítač startuje, vyčkej do úplného zapnutí."
        //"Počítač nemůže nastartovat, zkontrolujte jednotlivé komponenty např. paměť a oba disky."

        Procesor imarketaProcesor = new Procesor();
        imarketaProcesor.setRychlost(3_400_000_000_00L);
        imarketaProcesor.setVyrobce("Dell");

        Pamet imarketaPamet = new Pamet();
        imarketaPamet.setKapacita(16_000_000_000L);

        Disk imarketaDisk1 = new Disk();
        imarketaDisk1.setKapacitaDisku(255_195_746_304L);
        Disk imarketaDisk2 = new Disk();
        imarketaDisk2.setKapacitaDisku(255_195_746_304L);

        imarketaPocitac.setCpu(imarketaProcesor);
        imarketaPocitac.setRam(imarketaPamet);
        imarketaPocitac.setPevnyDisk1(imarketaDisk1);
        imarketaPocitac.setDisk2(imarketaDisk2);

        System.out.println(imarketaDisk1);
        System.out.println(imarketaDisk2);

        System.out.println(imarketaPocitac);

        imarketaPocitac.zapniSe();
        //pc běží, vypíše se chyba "Počítač je již zapnutý."

        imarketaPocitac.zapniSe();
        System.out.println(imarketaPocitac);

        imarketaPocitac.vytvorSouborOVelikosti(255_195_746_304L);
        System.out.println(imarketaPocitac);
        imarketaPocitac.vymazSouborOVelikosti(255_195_746_304L * 2);
        imarketaPocitac.vytvorSouborOVelikosti2Disku(255_195_746_304L);
        imarketaPocitac.vymazSouborOVelikosti2Disku(255_195_746_304L - 50_000_000_000L);
        imarketaPocitac.vymazSouborOVelikosti2Disku(255_195_746_304L - 100_000_000_000L);
        imarketaPocitac.vymazSouborOVelikosti2Disku(255_195_746_304L + 255_195_746_304L);
        System.out.println(imarketaPocitac);

        imarketaPocitac.vypniSe();
        imarketaPocitac.vypniSe();
        imarketaPocitac.vytvorSouborOVelikosti(300000);
    }

}
