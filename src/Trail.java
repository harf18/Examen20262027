public class Trail extends Activite {
    private int denivelePositif;

    public Trail(String nom, double distanceKm, int tpsMinutes, int denivelePositif) {
        super(nom, tpsMinutes, distanceKm);
        this.denivelePositif = denivelePositif;
    }

    public int getDenivelePositif() {
        return denivelePositif;
    }

    @Override
    public String decrire() {
        return "Trail : " + nom + "distance en kilomètres : " + distanceKm + " temps en minutes : " + tpsMinutes + " dénivele positif " + denivelePositif;
    }

    @Override
    public String toCSV() {
        return nom + ";" + tpsMinutes + ";" + distanceKm + ";" + denivelePositif;
    }
}
