import java.util.ArrayList;
import java.util.List;

public class Carnet {
    private List<Courses> courses;

    public Carnet() {
        this.courses = new ArrayList<>;
    }

    public void ajouter(Courses courses) {
        if (courses != null) {
            this.courses.add(courses);
        }
    }

    public void lister() {
        for (Courses c : courses) {
            System.out.println(c);
        }
    }
    public int distanceTotale() {
        int total = 0;
        for (Courses c : courses) {
            total += ();
        }
        return total;
    }
}





