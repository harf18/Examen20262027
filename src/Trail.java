public class Trail extends Sortie {
    private int denivelePositif;

    public Trail(String nom, double distanceKm, int tempsMinute, int denivelePositif){
        super(nom, distanceKm, tempsMinute);
        this.denivelePositif = denivelePositif;
    }

    @Override
    public String decrire() {
        return "Trail : " + nom + ", distance : " + distanceKm + "km , temps : " + tempsMinute + " minute(s), dénivelé : " + denivelePositif +" mètres" + ", allure moyenne : " + allureMoyenne() + ",  km-effort : " + kmEffort();
    }

    public double kmEffort(){
        return distanceKm + (denivelePositif/100.00);
    }

    public int getDenivelePositif() {
        return denivelePositif;
    }
}
