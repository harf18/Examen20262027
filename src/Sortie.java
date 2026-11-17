public abstract class Sortie {

    String nom;
    double distance;
    int tpsMin;

    public Sortie (String nom, double distance, int tpsMin){
        this.nom = nom;
        this.distance = distance;
        this.tpsMin = tpsMin;
    }

    abstract String descSortie();

}
