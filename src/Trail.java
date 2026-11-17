public class Trail extends Sortie{
    private int nDenivelePositif;

    public Trail(String nom, double distance, int temps, int nDenivelePositif) {
        super(nom, distance, temps);
        this.nDenivelePositif = nDenivelePositif;
    }

    @Override
    public double kmEffort() {
        return distance +  (double)nDenivelePositif / 100;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nNombre dénivelé positif : %s", nDenivelePositif);
    }
}
