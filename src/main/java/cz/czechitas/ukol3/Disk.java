package cz.czechitas.ukol3;

public class Disk {
    private long kapacitaDisku;
    private long vyuziteMisto;

    @Override
    public String toString() {
        return "Disk{" +
                "kapacita=" + kapacitaDisku +
                ", využité místo=" + vyuziteMisto +
                '}';
    }

    public long getKapacitaDisku() {
        return kapacitaDisku;
    }

    public void setKapacitaDisku(long kapacita) {
        this.kapacitaDisku = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long vyuziteMisto) {
        this.vyuziteMisto = vyuziteMisto;
    }
}
