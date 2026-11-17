public class CourseSurRoute extends Activite {
    private boolean competition;

    public CourseSurRoute(String nom, double distanceKm, int tpsMinutes, boolean competition) {
        super(nom, tpsMinutes, distanceKm);
        this.competition = competition;
    }

    @Override
    public String decrire() {
        return "Course sur route : " + nom + " distance en kilomètres : " + distanceKm + " temps en minutes : " + tpsMinutes + (competition ? "compétition" : "entraînement");
    }

    @Override
    public String toCSV() {
        return nom + ";" + tpsMinutes + ";" + distanceKm + ";" + competition;
    }
}

