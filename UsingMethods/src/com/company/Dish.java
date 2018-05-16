package com.company;

public class Dish {
    private String name;
    private short measure;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getMeasure() {
        return measure;
    }

    public void setMeasure(short measure) {
        if(measure>=100&&measure<=200)
        {
            this.measure = measure;
        }
    }

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", measure=" + measure +
                '}';
    }
    public Dish(String name, short measure)
    {
        this.name = name;
        setMeasure(measure);
    }

   public Dish()
   {

   }

}

