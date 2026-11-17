public class Trail extends Sortie {

    int deniv;

    public Trail(String nom, float distance, int temps, int deniv){

        super(nom, distance, temps);
        this.deniv = deniv;

    }

    @Override
    public String toCSV() {
        return super.toCSV() + ";;" + deniv + ";";
    }

    @Override
    public String toString() {
        return "La sortie de type " + nom + " fait " + distance + " km et dure " + temps + " pages. Le denivele est de " + deniv + " m.";
    }

    @Override
    public float getEffort() {
        return distance + (deniv / 1000);
    }

    public int getDeniv() {
        return deniv;
    }



}
