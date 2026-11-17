import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Carnet {

    Sortie[] listeSorties;
    int nbSorties;

    public Carnet(){
        this.listeSorties = new Sortie[1000];
        this.nbSorties = 0;
    }

    public void ajouter(Sortie s){
        this.listeSorties[this.nbSorties] = s;
        this.nbSorties ++;
    }

    public void lister(){
        for (int i = 0; i < nbSorties; i++){
            System.out.println(this.listeSorties[i].descSortie());
        }
    }

    public double distanceTotale(){
        double distTot = 0;
        for (int i = 0; i < nbSorties; i++){
            distTot += this.listeSorties[i].distance;
        }
        return distTot;
    }

    public double kmEffortTotal(){
        double kmeTot = 0;
        for (int i = 0; i < nbSorties; i++){
            kmeTot += this.listeSorties[i].kmEffort();
        }
        return kmeTot;
    }

    public double deniveleTotal(){
        double denivTot = 0;
        for (int i = 0; i < nbSorties; i++){
            if (this.listeSorties[i].getClass() == Trail.class){
                denivTot += (this.listeSorties[i].kmEffort() - this.listeSorties[i].distance) * 100;
            }
        }
        return denivTot;
    }

    public void exporterCSV(String cheminCompletFichier) throws IOException {

        Path path = Paths.get(cheminCompletFichier);
        try {

            List<String> lignes = new ArrayList<>();
            for (int i = 0; i < nbSorties; i++) {
                lignes.add(this.listeSorties[i].toString());
            }
            Files.write(path, lignes);
        }
        catch (IOException e){
            System.err.println("Erreur lors de l'écriture : " + e.getMessage());
        }
    }

}
