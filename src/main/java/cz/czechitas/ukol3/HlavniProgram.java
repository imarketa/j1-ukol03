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
        imarketaProcesor.setRychlost(1000L);
        imarketaProcesor.setVyrobce("Intel");

        Pamet imarketaPamet = new Pamet();
        imarketaPamet.setKapacita(1000L);

        Disk imarketaDisk1 = new Disk();
        imarketaDisk1.setKapacitaDisku(1000L);
        Disk imarketaDisk2 = new Disk();
        imarketaDisk2.setKapacitaDisku(1000L);

        imarketaPocitac.setCpu(imarketaProcesor);
        imarketaPocitac.setRam(imarketaPamet);
        imarketaPocitac.setPevnyDisk1(imarketaDisk1);
        imarketaPocitac.setPevnyDisk2(imarketaDisk2);

        System.out.println(imarketaDisk1);
        System.out.println(imarketaDisk2);

        System.out.println(imarketaPocitac);

        imarketaPocitac.zapniSe();
        //pc běží, vypíše se chyba "Počítač je již zapnutý."

        imarketaPocitac.zapniSe();
        System.out.println(imarketaPocitac);

        //Pevný disk 1 je prázdný.
        imarketaPocitac.vytvorSouborOVelikosti(1000L);
        imarketaPocitac.vymazSouborOVelikosti(1000*2);

        imarketaPocitac.vytvorSouborOVelikosti2Disku(1000L);
        imarketaPocitac.vymazSouborOVelikosti2Disku(1000L);
        System.out.println(imarketaPocitac);

        imarketaPocitac.vypniSe();
        imarketaPocitac.vypniSe();
        imarketaPocitac.vytvorSouborOVelikosti(300000);
    }

}
