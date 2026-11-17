public class Main {
    public static void main(String[] args) {
        // System.out.println("Le projet fonctionne !");


        Carnet carnet = new Carnet();

        //j'ai ajouté des f derrière les float

        carnet.ajouter(new CourseRoute("Semi de Poitiers", 21.1f, 105, true));
        carnet.ajouter(new Trail("Trail des Coteaux", 25.0f, 180, 900));
        carnet.ajouter(new Fractionne("VMA 10x400", 8.0f, 45, 10));

        carnet.lister();

        System.out.println("Distance totale : " + carnet.distanceTotale() + " km");

        System.out.println("Km-effort total : " + carnet.kmEffortTotal());
        System.out.println("Dénivelé positif total : " + carnet.deniveleTotal() + " m");

        carnet.exporterCSV("carnet.csv");

    }
}
