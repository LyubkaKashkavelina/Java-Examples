package com.company;

public class CompanyET extends Company {

    private String nameOfCreator;
    private Double firstBudget;
    private Double currentBudget;


    public CompanyET(String nameOfCompany, String dateOfCreation, String bulstat, String nameOfCreator, Double firstBudget, Double currentBudget) {
        super(nameOfCompany, dateOfCreation, bulstat);
        this.nameOfCreator = nameOfCreator;
        this.firstBudget = firstBudget;
        this.currentBudget = currentBudget;
    }
    //    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }

    public String getNameOfCreator() {
        return nameOfCreator;
    }

    public Double getFirstBudget() {
        return firstBudget;
    }

    public Double getCurrentBudget() {
        return currentBudget;
    }

    public void setNameOfCreator(String nameOfCreator) {
        this.nameOfCreator = nameOfCreator;
    }

    public void setFirstBudget(Double firstBudget) {
        this.firstBudget = firstBudget;
    }

    public void setCurrentBudget(Double currentBudget) {
        this.currentBudget = currentBudget;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "CompanyET{" +
                "nameOfCreator='" + nameOfCreator + '\'' +
                ", firstBudget=" + firstBudget +
                ", currentBudget=" + currentBudget +
                '}';

    }

    public double getProfit()
    {

     return this.currentBudget-this.firstBudget;
    }
}
