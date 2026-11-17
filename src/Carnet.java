import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.round;

public class Carnet {
    static Sortie[] sorties = new Sortie[10];
    int nbSorties;

    public void ajouter(Sortie sortie) {
        if (nbSorties < sorties.length) {
            sorties[nbSorties] = sortie;
            nbSorties++;
        } else {
            System.out.println("Le nombre de sortie maximale pour ce carnet est de 10");
        }
    }

    public Sortie lister(){
        for (int i = 0; i < nbSorties; i++) {
            System.out.println(sorties[i].getNom() + ", "
                    + sorties[i].getDistanceKm() + ", "
                    + sorties[i].getTpsMinute() + ", "
                    + sorties[i].kmEffort() + ", "
                    + sorties[i].allureMoyenne() + ", ");
        }
        return null;
    }

    public double distanceTotale(){
        double distanceTotale = 0;
        for (int i = 0; i < nbSorties; i++) {
            distanceTotale += sorties[i].getDistanceKm();
        }
        return distanceTotale;
    }

    public double kmEffortTotal(){
        double kmEffortTotal = 0;
        for (int i = 0; i < nbSorties; i++) {
            kmEffortTotal += sorties[i].kmEffort();
        }
        return kmEffortTotal;
    }

    public double deniveleTotal(){
        double deniveleTotal = 0;
        for (int i = 0; i < nbSorties; i++) {
            if (sorties[i].getDeniveleMetre() != 0) {
                deniveleTotal += sorties[i].getDeniveleMetre();
            }
        }
        return deniveleTotal;
    }

    public static void exporterCSV(String cheminCompletFichier) throws IOException {
        Path path = Paths.get(cheminCompletFichier);
        Files.deleteIfExists(path);
        List<String> lignes = new ArrayList<>();
        if (sorties != null) {
            for (Sortie sortie : sorties) {
                if (sortie != null) {
                    lignes.add(sortie.toString());
                }
            }
        }
        Files.write(path, lignes, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
    }
}
