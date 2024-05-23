package entities.dipendenti;
import enums.Dipartimenti;



public abstract class Dipendente {
    private int id;
    private double stipendioBase;
    private Dipartimenti dipartimenti;

    public Dipendente(Dipartimenti dipartimenti) {
        this.id = (int) (Math.random() * 900000) + 100000;
        this.stipendioBase = calculateSalary();
        this.dipartimenti = dipartimenti;
    }

    public int getId(){
        return id;
    }
    public Dipartimenti getDepartment() {
        return dipartimenti;
    }

    public abstract double calculateSalary();

    public void getInfo() {
        System.out.println("ID: " + getId());
        System.out.println("Dipartimento: " + getDepartment());
        System.out.println("Stipendio per questo mese: " + calculateSalary());
    }
}


