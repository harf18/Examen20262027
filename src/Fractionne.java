public class Fractionne extends Activite {
    private int nbRep;

    public Fractionne(String nom, double distanceKm, int tpsMinutes, int nbRep) {
        super(nom, tpsMinutes, distanceKm);
        this.nbRep = nbRep;
    }

    @Override
    public String decrire() {
        return "Fractionne : " + nom + "distance en kilomètres : " + distanceKm + " temps en minutes : " + tpsMinutes + " nombre de répétitions " + nbRep;
    }

    @Override
    public String toCSV() {
        return nom + ";" + tpsMinutes + ";" + distanceKm + ";" + nbRep;
    }
}

