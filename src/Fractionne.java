public class Fractionne extends Sorties{
    private int nbRepetition;

    public Fractionne(String nom, double distance, int temps, int nbRepetition) {
        super(nom, distance, temps);
        this.nbRepetition = nbRepetition;
    }
    @Override
    public String toString() {
        return "Fractionné : " + super.toString() + "\nNombre de répétition : " + nbRepetition;
    }
    @Override
    public String toCSV() {
        return "Fractionné;" + getNom() + ";" + getDistance() + ";" + getTemps() + ";" + nbRepetition;
    }

    @Override
    public double allure(){
        return getTemps() / getDistance();
    }

    @Override
    public double kmEffort(){
        return getDistance();
    }
}
