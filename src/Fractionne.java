public class Fractionne extends Sortie{
    private int nbRepetition;

    public Fractionne(String nom, double distanceKm, int tpsMinute, int nbRepetition) {
        super(nom, distanceKm, tpsMinute);
        this.nbRepetition = nbRepetition;
    }

    @Override
    public String toString() {
        return "CourseRoute{" +
                "nom =" + getNom() + " , " +
                "distance en km =" + getDistanceKm() + " , " +
                "temps en minutes =" + getTpsMinute() + " , " +
                "allure moyenne =" + allureMoyenne() + " , " +
                "kilomètre effort =" + kmEffort() + " , " +
                "competition=" + nbRepetition +
                '}';
    }

    public double kmEffort(){
        return getDistanceKm();
    }

    public double getDeniveleMetre() {
        return 0;
    }
}
