public abstract class Activite {
    public String nom;
    public int tpsMinutes;
    public double distanceKm;

    public Activite(String nom, int tpsMinutes, double distanceKm) {
        this.nom = nom;
        this.tpsMinutes = tpsMinutes;
        this.distanceKm = distanceKm;
    }

    public double getAllureMoyenne() {
        return tpsMinutes/distanceKm;
    }

    public double getDistanceTotale() {
        return distanceKm;
    }

    public abstract String decrire();

    public abstract String toCSV();

    @Override
    public String toString() {
        return decrire();
    }
}

