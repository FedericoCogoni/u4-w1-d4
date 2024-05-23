package entities.dipendenti;

import enums.Dipartimenti;

public class Dirigente extends Dipendente {
    private double bonusDirigente;
    private double stipendioBase = 3000;
    public Dirigente(double bonusDirigente) {
        super(Dipartimenti.DIRIGENZA);
        this.stipendioBase = 3500;
        this.bonusDirigente = bonusDirigente;
    }

    @Override
    public double calculateSalary() {
        return stipendioBase + bonusDirigente;
    }

    public double getBonusDirigente() {
        return bonusDirigente;
    }

}
