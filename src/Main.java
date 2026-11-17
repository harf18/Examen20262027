public class Main {
    public static void main(String[] args) {
        System.out.println("Le projet fonctionne !");

        CourseRoute c1 = new CourseRoute("aaa", 12, 15, false);
        //System.out.println(c1.descSortie());

        Trail c2 = new Trail("aaa", 12.5, 15, 150);
        //System.out.println(c2.descSortie());
        System.out.println(c2.distance + (c2.deniv/100));

        Fractionne c3 = new Fractionne("aaa", 12, 15, 150);
        //System.out.println(c3.descSortie());

        /*
        Carnet carnet = new Carnet();

        carnet.ajouter(new CourseRoute("Semi de Poitiers", 21.1, 105, true));
        carnet.ajouter(new Trail("Trail des Coteaux", 25.0, 180, 900));
        carnet.ajouter(new Fractionne("VMA 10x400", 8.0, 45, 10));

        carnet.lister();

        System.out.println("Distance totale : " + carnet.distanceTotale() + " km");
        System.out.println("Km-effort total : " + carnet.kmEffortTotal());
        System.out.println("Dénivelé positif total : " + carnet.deniveleTotal() + " m");

        carnet.exporterCSV("carnet.csv");
        */
    }
}
