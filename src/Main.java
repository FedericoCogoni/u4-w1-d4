import entities.dipendenti.Dipendente;
import entities.dipendenti.DipendenteFullTime;
import entities.dipendenti.DipendentePartTime;
import entities.dipendenti.Dirigente;
import enums.Dipartimenti;

public class Main {
    public static void main(String[] args) {
       /* DipendenteFullTime dipendenteFullTime = new DipendenteFullTime(Dipartimenti.PRODUZIONE);
        System.out.println("Informazioni full-time:");
        System.out.println("ID: " + dipendenteFullTime.getId());
        System.out.println("Dipartimento: " + dipendenteFullTime.getDepartment());
        System.out.println("Stipendio: " + dipendenteFullTime.calculateSalary());
        System.out.println();


        DipendentePartTime dipendentePartTime2 = new DipendentePartTime(Dipartimenti.VENDITE, 12.0, 15.5);
        DipendentePartTime dipendentePartTime = new DipendentePartTime(Dipartimenti.AMMINISTRAZIONE, 15.0, 20.0);
        System.out.println("Informazioni part-time:");
        System.out.println("ID: " + dipendentePartTime.getId());
        System.out.println("Dipartimento: " + dipendentePartTime.getDepartment());
        System.out.println("Stipendio: " + dipendentePartTime.calculateSalary());
        System.out.println();


        Dirigente dirigente = new Dirigente(2000.0);
        System.out.println("Informazioni dirigente:");
        System.out.println("ID: " + dirigente.getId());
        System.out.println("Dipartimento: " + dirigente.getDepartment());
        System.out.println("Bonus dirigente: " + dirigente.getBonusDirigente());
        System.out.println( "Stipendio: " + dirigente.calculateSalary() + " (Stipendio base + bonus)"); */

        Dipendente[] dipendenti = new Dipendente[10];
        dipendenti[0] = new DipendenteFullTime(Dipartimenti.PRODUZIONE);
        dipendenti[1] = new DipendentePartTime(Dipartimenti.AMMINISTRAZIONE, 15.0, 20.0);
        dipendenti[2] = new DipendentePartTime(Dipartimenti.VENDITE, 12.0, 15.5);
        dipendenti[3] = new Dirigente(2000.0);
        dipendenti[4] = new DipendenteFullTime(Dipartimenti.PRODUZIONE);
        dipendenti[5] = new DipendentePartTime(Dipartimenti.AMMINISTRAZIONE, 18.0, 22.5);
        dipendenti[6] = new DipendentePartTime(Dipartimenti.VENDITE, 11.0, 17.5);
        dipendenti[7] = new Dirigente(2500.0);
        dipendenti[8] = new DipendenteFullTime(Dipartimenti.PRODUZIONE);
        dipendenti[9] = new DipendentePartTime(Dipartimenti.AMMINISTRAZIONE, 14.0, 18.0);

        double salarioTotale = 0.0;
        for (int i = 0; i < dipendenti.length; i++) {
            salarioTotale += dipendenti[i].calculateSalary();
            System.out.println(" ");
            System.out.println("INFO Dipendente " + ++i);
            dipendenti[i].getInfo();
            System.out.println(" ");
        }
        System.out.println("------------Salario Totale------------");
        System.out.println("Salario totale dei dipendenti: " + salarioTotale);

    }
}