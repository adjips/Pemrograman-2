package Pra_UTS.Soal3;

/**
 *
 * @author Adji Pangestu
 */
public class Manajer extends Employee {

    private double bonus;

    public Manajer(double bonus, String name, String address, double salary) {
        super(name, address, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + getBonus();
    }
}
