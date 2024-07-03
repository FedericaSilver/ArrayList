import java.util.ArrayList;

/*
Creare una classe Student che accetti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Federica", 29));
        studenti.add(new Student("Mario", 20));
        studenti.add(new Student("Andrea", 18));
        studenti.add(new Student("Alice", 24));
        //System.out.println(studenti);
        studenti.forEach(System.out::println);

        

    }
}