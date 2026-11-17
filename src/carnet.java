import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class carnet {
    private List<Activite> activites;

    public carnet() {
        activites = new ArrayList<>();
    }

    public void ajouter(Activite a) {
        activites.add(a);
    }

    public void lister() {
        System.out.println("=== Courses effectuées (" + activites.size() + ") ===");
        for (Activite a : activites) {
            System.out.println(a.decrire());
        }
    }

    public double distanceTotale() {
        double total = 0;
        for (Activite a : activites) {
            total += a.getDistanceTotale();
        }
        return total;
    }

    public double allureMoyenne() {
        double allure = 0;
        for (Activite a : activites) {
            allure += a.getAllureMoyenne();
        }
        return allure;
    }

    public void exporterCSV(String nomFichier) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(nomFichier))) {
            pw.println("nom; distance; temps (en min); spécificité");
            for (Activite a : activites) {
                pw.println(a.toCSV());
            }
            System.out.println("Export CSV réussi : " + nomFichier);
        } catch (IOException e) {
            System.out.println("Erreur lors de l'export CSV : " + e.getMessage());
        }
    }
}
