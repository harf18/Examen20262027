public class Trail extends Sortie{

    int deniv;

    public Trail(String nom, double distance, int tpsMin, int deniv){
        super(nom, distance, tpsMin);
        this.deniv = deniv;
    }

    @Override
    public double kmEffort(){
        return distance + (deniv/100);
    }

    public String descSortie(){
        return "Nom de la course : " + this.nom
                + "\nDistance : " + this.distance
                + "km\nTemps de la course : " + this.tpsMin
                + " minutes\nDénivelé : " + this.deniv + "m"
                + "\nAllure moyenne : " + this.allureMoy()
                + "\nKm-effort : " + this.kmEffort();
    }

    public String toString(){

        return '"' + this.nom
                + "\";" + this.distance
                + ";" + this.tpsMin
                + ";" + this.deniv
                + ";" + this.allureMoy()
                + ";" + this.kmEffort();

    }

}
