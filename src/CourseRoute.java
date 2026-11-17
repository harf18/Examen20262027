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
                + " minutes\nCompétition : " + (this.compet == true ? "Oui" : "Non")
                + "\nAllure moyenne : " + this.allureMoy()
                + "\nKm-effort : " + this.kmEffort();
    }

    public String toString(){

        return '"' + this.nom
                + "\";" + this.distance
                + ";" + this.tpsMin
                + ";\"" + (this.compet == true ? "Oui" : "Non")
                + "\";" + this.allureMoy()
                + ";" + this.kmEffort();

    }

}
