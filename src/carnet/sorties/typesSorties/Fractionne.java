package carnet.sorties.typesSorties;

import carnet.sorties.Sorties;

public class Fractionne extends Sorties {

    private final int repetition;

    public Fractionne(String nom, double distance, byte temps, int repetition) {
        super(nom, distance, temps);
        this.repetition = repetition;
    }

    public int getRepetition() {
        return repetition;
    }

    public double getKmEffort() {
        return getDistance();
    }

    @Override
    public String toString() {
        return "Sortie : " + getNom() + ", distance " + getDistance() + "Km" + ", temps "
                + getTemps() + " minutes" + ", répétition " + getRepetition();
    }

    @Override
    public String toCSV() {
        return getNom() + getDistance() + getTemps() + getRepetition();
    }
}
