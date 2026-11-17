public class Fractionne extends Sortie{

    int repet;

    public Fractionne(String nom, double distance, int tpsMin, int repet){
        super(nom, distance, tpsMin);
        this.repet = repet;
    }

    public String descSortie(){
        return "Nom de la course : " + this.nom
                + "\nDistance : " + this.distance
                + "km\nTemps de la course : " + this.tpsMin
                + " minutes\nNombre de répétitions : " + this.repet
                + "\nAllure moyenne : " + this.allureMoy()
                + "\nKm-effort : " + this.kmEffort();
    }

    public String toString(){

        return '"' + this.nom
                + "\";" + this.distance
                + ";" + this.tpsMin
                + ";" + this.repet
                + ";" + this.allureMoy()
                + ";" + this.kmEffort();

    }

}
