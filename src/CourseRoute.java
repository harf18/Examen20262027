public class CourseRoute extends Sortie{
    private boolean competition;

    public CourseRoute(String nom, double distance, int temps, boolean competition) {
        super(nom, distance, temps);
        this.competition = competition;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nCompetition : %s", competition);
    }

    public boolean isCompetition() {
        return competition;
    }
}
