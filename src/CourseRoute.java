public class CourseRoute extends Sortie{
    private boolean competition;

    public CourseRoute(String nom, double distanceKm, int tpsMinute, boolean competition) {
        super(nom, distanceKm, tpsMinute);
        this.competition = competition;
    }

    @Override
    public String toString() {
        return "CourseRoute{" +
                "nom =" + getNom() + " , " +
                "distance en km =" + getDistanceKm() + " , " +
                "temps en minutes =" + getTpsMinute() + " , " +
                "allure moyenne =" + allureMoyenne() + " , " +
                "kilomètre effort =" + kmEffort() + " , " +
                "competition=" + competition +
                '}';
    }

    public double kmEffort(){
        return getDistanceKm();
    }

    public double getDeniveleMetre() {
        return 0;
    }
}
