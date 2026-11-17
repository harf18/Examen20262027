public abstract class Sortie {

    protected String nom;
    protected double distanceKm;
    protected int tempsMinute;

    /*Constructeur*/
    public Sortie(String nom, double distanceKm, int tempsMinute){
        this.nom = nom;
        this.distanceKm = distanceKm;
        this.tempsMinute = tempsMinute;
    }

    public abstract String decrire();

    public double allureMoyenne(){
        return tempsMinute/distanceKm;
    }

    public double kmEffort(){
        return distanceKm;
    }

    /*getter*/
    public double getDistanceKm() {
        return distanceKm;
    }
}
