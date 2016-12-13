// Naziv klase
class Student {
     
    // Atributi klase
    String ime;
    String prezime;
    String brojIndexa;
    int godina;
     
     
    /* Klase mogu sadrzavati
     * - atribute
     * - metode
     */
}
 
// Glavna public klasa se mora zvati kao fajl
public class App {
 
    public static void main(String[] args) {
         
         
        // Kreiramo objekat person1 tipa klase Person
        Student student1 = new Student();  
        student1.ime = "Marko";
        student1.prezime = "Jovic";
        student1.brojIndexa = "345";
        student1.godina = 18;
         
        // Kreiramo jos jedan objekat tipa klase Person
        Student student2 = new Student();  
        student2.ime = "Mila";
        student2.prezime = "Jovovic";
        student2.brojIndexa = "456";
        student2.godina = 21;
         
        System.out.println(student1.ime + " " + student1.prezime + " " + student1.brojIndexa + " " + student1.godina);

        System.out.println(student2.ime + " " + student2.prezime + " " + student2.brojIndexa + " " + student2.godina);
    }
 
}