public class Fractionner extends Carnet{

    private final int nbRepetition;
    // Ordre imposé par le main : (modele, nbPlaces, prixJour)
    public Fractionner(String nom, double distance, int temps, int nbRepetition) {
        super(nom, distance, temps);
        this.nbRepetition = nbRepetition;
    }

    @Override
    public double getDistance() {
        return distance * nbRepetition;
    }

    @Override
    public String toString() {
        return "Cours : " + getNom() + ", " + getDistance() + " KM, " + getTemps() + " minutes" + getAllure() + "vitessse" + getEffort() + "effort";
    }

    @Override
    public String toCSV() {
        return "Cours;" + getNom() + ";" + getDistance() + ";" + getTemps() + ";" + getAllure();
    }

}
