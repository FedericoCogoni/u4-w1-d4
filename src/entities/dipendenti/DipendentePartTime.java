package entities.dipendenti;

import enums.Dipartimenti;

public class DipendentePartTime extends Dipendente{
    private double stipendioOrario;
    private double oreLavorate;

    public DipendentePartTime(Dipartimenti dipartimenti, double stipendioOrario, double oreLavorate) {
        super(dipartimenti);
        this.stipendioOrario = stipendioOrario;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return oreLavorate * stipendioOrario;
    }
}
