public abstract class Sortie {
    String nom;
    float distance;
    int temps;

    Sortie(String nom, float distance, int temps){
        this.nom = nom;
        this.distance = distance;
        this.temps = temps;
    }

    public float getDistance() {
        return distance;
    }

    public int getMinute() {
        return temps;
    }

    public float getEffort() {
        return distance;
    }



    public String toCSV() {
        return getClass().getSimpleName() + ";" + nom + ";" + distance + ";" + temps;
    }

}