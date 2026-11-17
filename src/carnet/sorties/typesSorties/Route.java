package carnet.sorties.typesSorties;

import carnet.sorties.Sorties;

public class Route extends Sorties {

    private final boolean competition;

    public Route(String nom, double distance, byte temps, boolean competition) {
        super(nom, distance, temps);
        this.competition = competition;
    }

    public boolean getCompetition() {
        return competition;
    }

    public double getKmEffort() {
        return getDistance();
    }

    @Override
    public String toString() {
        return "Sortie : " + getNom() + ", distance " + getDistance() + "Km" + ", temps "
                + getTemps() + " minutes" + ", competition " + getCompetition();
    }

    @Override
    public String toCSV() {
        return getNom() + getDistance() + getTemps() + getCompetition();
    }
}
