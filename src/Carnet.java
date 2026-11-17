import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Carnet {
    private List<Sortie> sorties;

    public Carnet() {
        this.sorties = new ArrayList<>();
    }

    public Carnet(List<Sortie> sorties) {
        this.sorties = sorties;
    }

    public void ajouter(Sortie sortie) {
        if (sortie == null) return;
        sorties.add(sortie);
    }

    public void lister()
    {
        for (Sortie sortie:sorties) {
            System.out.println(sortie + "\n");
        }
    }

    public double distanceTotale() {
        double distanceTotale = 0;
        for (Sortie sortie:sorties) {
            distanceTotale += sortie.getDistance();
        }
        return distanceTotale;
    }

    public double kmEffortTotal() {
        double kmEffortTotal = 0;
        for (Sortie sortie:sorties) {
            kmEffortTotal += sortie.kmEffort();
        }
        return kmEffortTotal;
    }

    public int deniveleTotal() {
        int deniveleTotal = 0;
        for (Sortie sortie:sorties) {
            if (sortie.getClass() == Trail.class) {
                deniveleTotal += ((Trail) sortie).getnDenivelePositif();
            }
        }
        return deniveleTotal;
    }

    public void exporterCSV(String fileName) {
        Path saveFile = Paths.get(fileName);
        String saveData = "";
        String personalElement;

        try {
            if (!(Files.exists(saveFile))) {
                Files.createFile(saveFile);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for (Sortie sortie:sorties) {

            saveData += String.format("%s;%s;%s;%s\n",
                    sortie.getClass().getName(),
                    sortie.getNom(),
                    sortie.getDistance(),
                    sortie.getTemps());

        }

        try {
            Files.writeString(saveFile,saveData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
