package carnet.sorties;

public abstract class Sorties {

    private final String nom;
    private final double distance;
    private final byte temps;
    private final double kmEffort = 0.0;

    protected Sorties(String nom, double distance, byte temps) {
        this.nom = nom;
        this.distance = distance;
        this.temps = temps;
    }

    public String getNom() {
        return nom;
    }

    public double getDistance() {
        return distance;
    }

    public byte getTemps() {
        return temps;
    }

    public double getAllureMoyenne() {
        return getTemps()/getDistance();
    }

    public abstract double getKmEffort();

    public abstract String toCSV();

}
