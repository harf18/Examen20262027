public class Trail extends Sorties{
    private int deniveler;

    public Trail(String nom, double distance, int temps, int deniveler) {
        super(nom, distance, temps);
        this.deniveler = deniveler;
    }

    public int getDeniveler() {
        return deniveler;
    }

    @Override
    public String toString() {
        return "Trail : " + super.toString() + "\nDénivelé positif : " + deniveler + "m";
    }
    @Override
    public String toCSV() {
        return "Trail;" + getNom() + ";" + getDistance() + ";" + getTemps() + ";" + deniveler;
    }

    @Override
    public double allure(){
        return getTemps() / getDistance();
    }

    @Override
    public double kmEffort(){
        return getDistance() + (deniveler/100);
    }
}
