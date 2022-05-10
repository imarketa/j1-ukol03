package cz.czechitas.ukol3;

public class Pocitac {
    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk1;
    private Disk pevnyDisk2;

    public Disk getDisk2() {
        return pevnyDisk2;
    }

    public void setDisk2(Disk disk2) {
        this.pevnyDisk2 = disk2;
    }

    public void vytvorSouborOVelikosti2Disku(long velikost) {
        if (jeZapnuty) {

            if ((pevnyDisk1.getVyuziteMisto() + velikost) <= pevnyDisk1.getKapacitaDisku()) {
                pevnyDisk1.setVyuziteMisto(pevnyDisk1.getVyuziteMisto() + velikost);
                System.out.println("Volné místo pevného disku 1: " + (pevnyDisk1.getKapacitaDisku() - pevnyDisk1.getVyuziteMisto()));
            } else if ((pevnyDisk2.getVyuziteMisto() + velikost) <= pevnyDisk2.getKapacitaDisku()) {
                pevnyDisk2.setVyuziteMisto(pevnyDisk2.getVyuziteMisto() + velikost);
                System.out.println("Volné místo pevného disku 2: " + (pevnyDisk2.getKapacitaDisku() - pevnyDisk2.getVyuziteMisto()));
            } else {
                System.out.println("Pevny disk 1 a pevný disk 2 jsou plné.");
            }

        } else {
            System.out.println("Počítač je vypnutý, zkus znovu po zapnutí.");
        }
    }

    public void vymazSouborOVelikosti2Disku(long velikost) {
        if (jeZapnuty) {
            if ((pevnyDisk1.getVyuziteMisto() - velikost) >= 0) {
                pevnyDisk1.setVyuziteMisto(pevnyDisk2.getVyuziteMisto() - velikost);
                System.out.println("Volné místo pevného disku 1: " + (pevnyDisk1.getKapacitaDisku() - pevnyDisk1.getVyuziteMisto()));
            } else if ((pevnyDisk2.getVyuziteMisto() - velikost) >= 0) {
                pevnyDisk2.setVyuziteMisto(pevnyDisk2.getVyuziteMisto() - velikost);
                System.out.println("Volné místo pevného disku 2: " + (pevnyDisk2.getKapacitaDisku() - pevnyDisk2.getVyuziteMisto()));
            } else {
                System.out.println("Pevný disk 1 a pevný disk 2 jsou prázdné.");
            }

        } else {
            System.out.println("Počítač je vypnutý, zkus znovu po zapnutí.");
        }

    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty){
            long volneMistoNaDisku1 = pevnyDisk1.getKapacitaDisku() - pevnyDisk1.getVyuziteMisto();
            long volneMistoNaDisku2 = pevnyDisk2.getKapacitaDisku() - pevnyDisk2.getVyuziteMisto();

            if(volneMistoNaDisku1 >= velikost) {
                pevnyDisk1.setVyuziteMisto(pevnyDisk1.getVyuziteMisto() + velikost);
                System.out.println("Vytvoril se soubor o velikosti " + velikost + ". Na disku 1 je vyuzite misto " + pevnyDisk1.getVyuziteMisto() + " bajtu z celkove kapacity " + pevnyDisk1.getKapacitaDisku() + " bajtu.");
            }

            else if(volneMistoNaDisku2 >= velikost){
                System.out.println("Na disku 1 neni dost mista. Soubor se zapise na disk 2.");
                pevnyDisk2.setVyuziteMisto(pevnyDisk2.getVyuziteMisto() + velikost);
                System.out.println("Vytvořil se soubor o velikosti " + velikost + ". Na disku 2 je využité místo. " + pevnyDisk2.getVyuziteMisto() + " bajtu z celkove kapacity " + pevnyDisk2.getKapacitaDisku() + " bajtu.");
            }

            else {
                System.err.println("Na discích neni dostatek místa.");
            }
        }

        else {
            System.err.println("Počítač je vypnutý, nemohu vytvářet soubory!");
        }
    }

    public void vymazSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            if ((pevnyDisk1.getVyuziteMisto() - velikost) >= 0) {
                pevnyDisk1.setVyuziteMisto(pevnyDisk1.getVyuziteMisto() - velikost);
                System.out.println("Volné místo na pevném disku 1: " + (pevnyDisk1.getKapacitaDisku() - pevnyDisk1.getVyuziteMisto()));
            } else {
                System.out.println("Pevný disk 1 je prázdný.");
                pevnyDisk1.setVyuziteMisto(0);
            }

        } else {
            System.out.println("Počítač je vypnutý, zkus znovu po zapnutí.");
        }
    }

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void zapniSe() {
        if (jeZapnuty) {
            System.out.println("Počítač je již zapnutý.");

        } else {
            System.out.println("Počítač startuje, vyčkej do úplného zapnutí.");
            if (cpu == null || ram == null || pevnyDisk1 == null) {
                System.out.println("Počítač nemůže nastartovat, zkontrolujte jednotlivé komponenty např. paměť a oba disky. ");
            } else {
                System.out.println("Počítač nastartoval a je zapnutý.");
                jeZapnuty = true;
            }
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
        } else {
            System.out.println("Počítač je vypnutý.");
        }
    }

    @Override
    public String toString() {
        return "Počítač{" +
                "cpu=" + cpu +
                ", ram=" + ram +
                ", pevný disk 1=" + pevnyDisk1 +
                ", pevný disk 2=" + pevnyDisk2 +
                '}';
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk1;
    }

    public void setPevnyDisk1(Disk pevnyDisk1) {
        this.pevnyDisk1 = pevnyDisk1;
    }
}
