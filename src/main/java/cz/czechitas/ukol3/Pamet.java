package cz.czechitas.ukol3;

public class Pamet {
    private long kapacita;

    public long getKapacita() {
        return kapacita;
    }

    @Override
    public String toString() {
        return "Pameť{" +
                "kapacita=" + kapacita +
                '}';
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }
}
