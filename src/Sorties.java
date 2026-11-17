public abstract class Sorties {
    private String nom;
    private double distance;
    private int temps;

    public Sorties(String nom, double distance, int temps) {
        this.nom = nom;
        this.distance = distance;
        this.temps = temps;
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

    public abstract String toCSV();

    public abstract double allure();

    public abstract double kmEffort();

    @Override
    public String toString() {
        return "Nom : " + nom + "\nDistance : " + distance + "km\nTemps : " + temps + "min";
    }
}
