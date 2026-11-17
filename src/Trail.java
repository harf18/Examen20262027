public class Trail extends Sortie{

    int deniv;

    public Trail(String nom, double distance, int tpsMin, int deniv){
        super(nom, distance, tpsMin);
        this.deniv = deniv;
    }

    public String descSortie(){
        return "Nom de la course : " + this.nom
                + "\nDistance : " + this.distance
                + "km\nTemps de la course : " + this.tpsMin
                + " minutes\nDénivelé : " + this.deniv + "m";
    }

}
