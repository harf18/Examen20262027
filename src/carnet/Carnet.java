package carnet;

import carnet.sorties.Sorties;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Carnet {

    private final List<Sorties> sorties = new ArrayList<>();

    public void ajouter(Sorties sortie) {
        if (sortie == null) {
            throw new IllegalArgumentException("La sortie ne peut pas être null");
        }
        sorties.add(sortie);
    }

    public void lister() {
        for (Sorties sortie : sorties) {
            System.out.println(sortie);
        }
    }

    public int distanceTotal() {
        int distanceTotal = 0;
        for (Sorties sortie : sorties) {
            distanceTotal += sortie.getDistance();
        }
        return distanceTotal;
    }

    public double kmEffortTotal() {
        double kmEffortTotal = 0.0;
        for (Sorties sortie : sorties) {
            kmEffortTotal += sortie.getKmEffort();
        }
        return kmEffortTotal;
    }


    public void exporterCSV(String nomFichier) {
        List<String> lignes = new ArrayList<>();
        lignes.add("nom;distance;temps;caracteristique");
        for (Sorties sortie : sorties) {
            lignes.add(sortie.toCSV());
        }
        try {
            Files.write(Path.of(nomFichier), lignes, StandardCharsets.UTF_8);
            System.out.println("Export terminé : " + nomFichier);
        } catch (IOException e) {
            System.out.println("Erreur lors de l'export CSV : " + e.getMessage());
        }
    }

}