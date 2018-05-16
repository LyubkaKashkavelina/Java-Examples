package com.company;

public class Cars {
    private String brand;
    private  String model;
    private String colour;
    private int power;
    private String typeOfEngine;
    private String typeOfTransmission;
    private String yearOfCreating;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(String typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public String getTypeOfTransmission() {
        return typeOfTransmission;
    }

    public void setTypeOfTransmission(String typeOfTransmission) {
        this.typeOfTransmission = typeOfTransmission;
    }

    public String getYearOfCreating() {
        return yearOfCreating;
    }

    public void setYearOfCreating(String yearOfCreating) {
        this.yearOfCreating = yearOfCreating;
    }

    public Cars(String brand, String model, String colour, int power, String typeOfEngine, String typeOfTransmission, String yearOfCreating) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.power = power;
        this.typeOfEngine = typeOfEngine;
        this.typeOfTransmission = typeOfTransmission;
        this.yearOfCreating = yearOfCreating;
    }
   // public Cars()
    {

    }

    @Override
    public String toString() {
        return "Cars{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", power=" + power +
                ", typeOfEngine='" + typeOfEngine + '\'' +
                ", typeOfTransmission='" + typeOfTransmission + '\'' +
                ", yearOfCreating='" + yearOfCreating + '\'' +
                '}';
    }

    public  Cars[] cleanArrayOfCars(String[] Cars1, char letter)
    {
       Cars[] NewCars = new Cars[Cars1.length];
        for (int i = 0;i<=Cars1.length;i++)
        {
            if(!(Cars1.
            if(Cars1[i].charAt(0)==letter)
            {
                int numberOfCarsInTheNewArray = 0;
                numberOfCarsInTheNewArray++;
                Cars1[i] = NewCars[i];

            }
        }
        return NewCars;
    }

}
