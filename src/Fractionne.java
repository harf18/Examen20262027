public class Fractionne extends Sortie{
    private int nRepetitions;

    public Fractionne(String nom, double distance, int temps, int nRepetitions) {
        super(nom, distance, temps);
        this.nRepetitions = nRepetitions;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nNombre de répétitions : %s", nRepetitions);
    }
}
