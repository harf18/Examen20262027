public class Trail extends Carnet{

    private final int denivele;
    public Trail(String nom, double distance, int temps,int denivele) {
        super(nom,distance, temps);
        this.denivele = denivele;
    }

    public int getDenivele() {
        return denivele;
    }


    @Override
    public String toString() {
        return "Trail : " + getNom() + ", " + getDistance() + " KM, " + getTemps() + " minutes" + + getAllure() + "vitessse" + getEffort() + "effort";
    }

    @Override
    public String toCSV() {
        return "Trail;" + getNom() + ";" + getDistance() + ";" + getTemps();
    }

    @Override
    public double getEffort() {
        return distance + (denivele / 100);
    }



}
