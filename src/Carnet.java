import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Carnet {

    private List<Sortie> sorties = new ArrayList<>();

    public void ajouter(Sortie a) {
        sorties.add(a);
    }

    public void lister() {
        System.out.println("--- " + sorties.size() + " documents dans la mediatheque ---");
        for (Sortie d : sorties) {
            System.out.println(d);
        }
    }

    public int distanceTotale() {
        int total = 0;
        for (Sortie d : sorties) {
            total += d.getDistance();
        }
        return total;
    }

    public int kmEffortTotal() {
        int totalEf = 0;
        for (Sortie d : sorties) {

            totalEf += d.getEffort();
        }
        return totalEf;
    }



    public int deniveleTotal() {
        int nb = 0;
        for (Sortie d : sorties) {
            if (d instanceof Trail j) {
                nb+= ((Trail) d).getDeniv();
            }
        }
        return nb;
    }

    public void exporterCSV(String cheminCompletFichier) {
        List<String> lignes = new ArrayList<>();
        lignes.add("type;titre;distance;temps;competition;deniv;repetition");
        for (Sortie d : sorties) {
            lignes.add(d.toCSV());
        }
        try {
            Files.write(Paths.get(cheminCompletFichier), lignes);
        } catch (IOException e) {
            System.out.println("Erreur export : " + e.getMessage());
        }
    }

}
