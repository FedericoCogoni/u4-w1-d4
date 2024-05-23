package entities.dipendenti;

import enums.Dipartimenti;

public class DipendenteFullTime extends Dipendente {

    private double stipendioBase = 3000;

    public DipendenteFullTime(Dipartimenti dipartimenti) {
        super(dipartimenti);

    }



    @Override
    public double calculateSalary() {
        return stipendioBase;
    }

}
