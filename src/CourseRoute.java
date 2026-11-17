public class CourseRoute extends Sortie{

    boolean compet;

    public CourseRoute(String nom, double distance, int tpsMin, boolean compet){
        super(nom, distance, tpsMin);
        this.compet = compet;
    }

    public String descSortie(){
        return "Nom de la course : " + this.nom
                + "\nDistance : " + this.distance
                + "km\nTemps de la course : " + this.tpsMin
                + " minutes\nCompétition : " + (compet == true ? "Oui" : "Non");
    }

}
