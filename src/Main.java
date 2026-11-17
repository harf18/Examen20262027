import carnet.Carnet;
import carnet.sorties.typesSorties.Fractionne;
import carnet.sorties.typesSorties.Route;
import carnet.sorties.typesSorties.Trail;

public class Main {
    public static void main(String[] args) {
        System.out.println("Le projet fonctionne !");


        Carnet carnet = new carnet.Carnet();

        carnet.ajouter(new Route("Semi de Poitiers", 21.1, 105, true));
        carnet.ajouter(new Trail("Trail des Coteaux", 25.0, 180, 900));
        carnet.ajouter(new Fractionne("VMA 10x400", 8.0, 45, 10));

        carnet.lister();

        System.out.println("Distance totale : " + carnet.distanceTotale() + " km");
        System.out.println("Km-effort total : " + carnet.kmEffortTotal());
        System.out.println("Dénivelé positif total : " + carnet.deniveleTotal() + " m");

        carnet.exporterCSV("carnet.csv");

    }
}
