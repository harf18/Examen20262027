public class Carnet {

    protected final String nom;
    protected double distance;
    protected final int temps ;
    protected final int alllureMoy ;

    // protected : appelé uniquement par les classes filles avec super(...)
    protected Carnet(String nom, double distance, int temps, int alllureMoy) {
        this.nom = nom;
        this.distance = distance;
        this.temps = temps;
        this.alllureMoy = alllureMoy;
    }
    public String getNom() {
        return nom;
    }

    public double getDistance() {
        return distance;
    }

    public int getTemps() {
        return temps;
    }

    public double getAllure() {
        return temps / distance;
    }



    public double getEffort() {
        return distance;
    }



    // Chaque véhicule sait produire SA ligne CSV
    public abstract String toCSV();

}
