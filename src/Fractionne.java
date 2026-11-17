public class Fractionne extends Sortie {

    int repet;

    public Fractionne(String nom, float distance, int temps, int repet){

        super(nom, distance, temps);
        this.repet = repet;

    }

    @Override
    public String toCSV() {
        return super.toCSV() + ";;;" + repet;
    }

    @Override
    public String toString() {
        return "La sortie de type " + nom + " fait " + distance + " km et dure " + temps + " pages. Le nombre de repetitions est de " + repet;
    }

    @Override
    public float getEffort() {
        return distance;
    }
}
