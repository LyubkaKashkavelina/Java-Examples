package com.company;

public class Company {
   private String nameOfCompany;
   private  String dateOfCreation;
   private String bulstat;

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public String getBulstat() {
        return bulstat;
    }

    public void setBulstat(String bulstat) {
        if(bulstat.length()==10) {
           this.bulstat = bulstat;
        }
    }

    //
//

    public Company(String nameOfCompany, String dateOfCreation, String bulstat) {
        this.nameOfCompany = nameOfCompany;
        this.dateOfCreation = dateOfCreation;
        this.bulstat = bulstat;
    }

    @Override
    public String toString() {
        return "Company{" +
                "nameOfCompany='" + nameOfCompany + '\'' +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", bulstat='" + bulstat + '\'' +
                '}';
    }



    }

