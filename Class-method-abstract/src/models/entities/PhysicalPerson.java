package models.entities;

public class PhysicalPerson extends ContributionData {

    private double healthExpenses;

    public PhysicalPerson(String name, double annualIncome, double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override

    public double tax() {
        if (getAnnualIncome() < 20000.0) {
            return getAnnualIncome() * 0.15 - getHealthExpenses() * 0.5;
        } else {
            return getAnnualIncome() * 0.25 - getHealthExpenses() * 0.5;
        }
    }

}
