public abstract class Courses {
    String nom;
    double distance;
    int temps;

    public Courses(String nom, int distance, int temps) {
        this.nom = nom;
        this.distance = distance;
        this.temps = temps;
    }

    public double allureMoyenne() {
        return temps / distance;
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
}
