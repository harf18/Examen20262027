package carnet.sorties.typesSorties;

import carnet.sorties.Sorties;

public class Trail extends Sorties {

    private final int denivelePositif;

    public Trail(String nom, double distance, byte temps, int denivelePositif) {
        super(nom, distance, temps);
        this.denivelePositif = denivelePositif;
    }

    public int getDenivelePositif() {
        return denivelePositif;
    }

    public double getKmEffort() {
        return getDistance() + (getDenivelePositif()/100.00) ;
    }

    @Override
    public String toString() {
        return "Sortie : " + getNom() + ", distance " + getDistance() + "Km" + ", temps "
                + getTemps() + " minutes" + ", dénivelé positif " + getDenivelePositif() + "mètre";
    }

    @Override
    public String toCSV() {
        return getNom() + getDistance() + getTemps() + getDenivelePositif();
    }
}
