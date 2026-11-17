public class Fractionne extends Sortie {
    private int nombreRepetition;

    public Fractionne(String nom, double distanceKm, int tempsMinute, int nombreRepetition){
        super(nom, distanceKm, tempsMinute);
        this.nombreRepetition = nombreRepetition;
    }

    @Override
    public String decrire() {
        return "Fractionne : " + nom + ", distance : " + distanceKm + "km , temps : " + tempsMinute + " minute(s), nombre de répétitions : " + nombreRepetition+ ", allure moyenne : " + allureMoyenne() + ",  km-effort : " + kmEffort();
    }
}

