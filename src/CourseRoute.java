public class CourseRoute extends Sortie {

    boolean competition;

    public CourseRoute(String nom, float distance, int temps, boolean competition){

        super(nom, distance, temps);
        this.competition = competition;

    }

    @Override
    public String toCSV() {
        return super.toCSV() + ";" + competition + ";;";
    }

    @Override
    public String toString() {
        return "La sortie de type " + nom + " fait " + distance + " km et dure " + temps + " pages." + (competition ? " Il s'agit d'une competition." : "");
    }

    @Override
    public float getEffort() {
        return distance;
    }
}
