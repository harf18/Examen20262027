public abstract class Sortie {
    protected String nom;
    protected double distance;
    protected int temps;

    public Sortie(String nom, double distance, int temps) {
        this.nom = nom;
        this.distance = distance;
        this.temps = temps;
    }

    public double allureMoyenne(){
        return temps/distance;
    }

    public  double kmEffort() {
        return distance;
    }

    @Override
    public String toString() {
        return String.format("%s : %s\nDistance : %f\nDuree : %s",
                this.getClass().getName(),
                this.nom,
                this.distance,
                this.temps);
    }
}
