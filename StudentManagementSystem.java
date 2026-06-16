import java.util.ArrayList;
import java.util.Scanner;

//Menge zum Speichern von Schülerobjekten erstellen
public class StudentManagementSystem{

    static ArrayList<Student>students=new ArrayList<>();

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        while(true){

            System.out.println("*****Schülernotenmanagementsystem*****");
            System.out.println("1.Schüler hinzufügen");
            System.out.println("2.Alle Schüler anzeigen");
            System.out.println("3.Schüler abfragen");
            System.out.println("4.Schüler bearbeiten");
            System.out.println("5.Schüler löschen");
            System.out.println("6.Programm beenden");
            System.out.println("Bitte geben Sie die Funktionsnummer ein:");

            int choice=sc.nextInt();

            switch(choice){
                case 1:
                    addStudent(sc);
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchStudent(sc);
                    break;
                case 4:
                    updateScore(sc);
                    break;
                case 5:
                    deleteStudent(sc);
                    break;
                case 6:
                   System.out.println("Programm beenden!");
                   sc.close();
                   return;
                default:
                    System.out.println("Tippfehler!");
            }
        }
    }
//Schüler hinzufügen
    public static void addStudent(Scanner sc){
        System.out.println("Bitte geben Sie die ID ein:");
        String id=sc.next();

        for(Student s:students){
            if(s.getId().equals(id)){
                System.out.println("Die Matrikelnummer existiert bereits!");
                return;
            }
        }

        System.out.println("Bitte geben Sie den Namen ein:");
        sc.nextLine();
        String name=sc.nextLine();

        System.out.println("Bitte geben Sie die Note ein:");
        Double score=sc.nextDouble();

        //Studentenobjekt erstellen
        Student student=new Student(id,name,score);

        //Studentenobjekt zur Sammlung hinzufügen
        students.add(student);

        System.out.println("Erfolgreich hinzugefügt!");
    }

    // Alle Studenten anzeigen
    public static void showStudents(){

        //Prüfen, ob die Sammlung leer ist
        if(students.isEmpty()) {
            System.out.println("Keine Studenteninformationen vorhanden!");
            return;
        }
        System.out.println("Matrikelnummer\tName\tNote");

        //Alle Studenteninformationen durchlaufen und ausgeben
        for(Student s:students){
            //System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getScore());
            System.out.printf("%-16s%-8s%-6.1f%n",s.getId(),s.getName(),s.getScore());
        }
    }
    //Studenten anhand der Matrikelnummer suchen
    public static void searchStudent(Scanner sc){
        System.out.println("Bitte geben Sie die zu suchende Matrikelnummer ein:");
        String id=sc.next();

        //Die Liste durchlaufen und den Studenten suchen
        for(Student s:students){
            if(s.getId().equals(id)){
                System.out.println("Suchergebnis:");
                System.out.println("Matrikelnummer:"+s.getId());
                System.out.println("Name:"+s.getName());
                System.out.println("Note:"+s.getScore());
                return;
            }
        }

        System.out.println("Student nicht gefunden!");
    }

    //Note des Studenten ändern
    public static void updateScore(Scanner sc){
        System.out.println("Bitte geben Sie die Matrikelnummer ein:");
        String id=sc.next();

        for(Student s:students){
            //Nach dem Finden des entsprechenden Studenten die Note ändern
            if(s.getId().equals(id)){
                System.out.println("Bitte geben Sie die neue Note ein:");
                double newScore =sc.nextDouble();

                //Setter-Methode aufrufen, um die Note zu aktualisieren
                s.setScore(newScore);
                System.out.println("Erfolgreich geändert!");
                return;
            }
        }
        System.out.println("Student nicht gefunden!");
    }

    //Student löschen
    public static void deleteStudent(Scanner sc){
        System.out.println("Bitte geben Sie die Matrikelnummer ein:");
        String id=sc.next();

        //Element über den Index suchen und löschen
        for(int i=0;i<students.size();i++){
            if(students.get(i).getId().equals(id)){

                students.remove(i);
                System.out.println("Erfolgreich gelöscht!");
                return;
            }
        }
        System.out.println("Student nicht gefunden!");
    }
}


