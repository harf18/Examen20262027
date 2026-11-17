public class Trail extends Sortie{
    public int deniveleMetre;

    public Trail(String nom, double distanceKm, int tpsMinute, int deniveleMetre) {
        super(nom, distanceKm, tpsMinute);
        this.deniveleMetre = deniveleMetre;
    }

    @Override
    public String toString() {
        return "CourseRoute{" +
                "nom =" + getNom() + " , " +
                "distance en km =" + getDistanceKm() + " , " +
                "temps en minutes =" + getTpsMinute() + " , " +
                "allure moyenne =" + allureMoyenne() + " , " +
                "kilomètre effort =" + kmEffort() + " , " +
                "competition=" + deniveleMetre +
                '}';
    }

    public double kmEffort(){
        return getDistanceKm() + ((double) deniveleMetre / 100);
    }

    public double getDeniveleMetre() {
        return deniveleMetre;
    }
}
