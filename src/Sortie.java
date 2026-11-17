import static java.lang.Math.round;

public class Sortie {
    private String nom;
    private double distanceKm;
    private int tpsMinute;

    public Sortie(String nom, double distanceKm, int tpsMinute) {
        this.nom = nom;
        this.distanceKm = distanceKm;
        this.tpsMinute = tpsMinute;
    }

    public String getNom() {
        return nom;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public int getTpsMinute() {
        return tpsMinute;
    }

    public double allureMoyenne() {
        return tpsMinute / distanceKm;
    }

    public double kmEffort(){
        return kmEffort();
    }

    public double getDeniveleMetre(){
        return getDeniveleMetre();
    }

}
