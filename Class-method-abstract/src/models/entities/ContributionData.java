package models.entities;

public abstract class ContributionData {

    private String name;
    private double annualIncome;

    public ContributionData(String name, double annualIncome) {
        this.setName(name);
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public void setName(String name) {
        this.name = name;
    }

    // method abstract
    public abstract double tax();

}