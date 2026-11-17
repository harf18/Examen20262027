public class Cours extends Carnet{



    // Ordre imposé par le main : (modele, nbPlaces, prixJour)
    public Cours(String nom, double distance, int temps) {
        super(nom, distance, temps);
    }


    @Override
    public boolean isCompetition() {
        return false;
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
