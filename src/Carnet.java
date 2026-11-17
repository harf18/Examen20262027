import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public abstract class Carnet {
    private List<Sortie> sortie = new ArrayList<>();

    public void ajouter(Sortie s){
        sortie.add(s);
    }

    public void lister(){
        for (Sortie s : sortie) {
            System.out.println(s.decrire());
        }
    }

    public double distanceTotal() {
        double total = 0;
        for (Sortie s : sortie) {
            total += s.getDistanceKm();
        }
        return total;
    }

    public double kmEffortTotal() {
        double total = 0;
        for (Sortie s : sortie) {
            total += s.kmEffort();
        }
        return total;
    }

    public double denivelePositifTotal(){
        double total = 0;
        for (Sortie s : sortie) {
            if (s instanceof Trail t && t.getDenivelePositif()){
                total += s.kmEffort();
        }
        return total;
    }

}
