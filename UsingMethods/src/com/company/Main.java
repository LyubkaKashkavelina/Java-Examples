package com.company;

public class Main {

    public static void main(String[] args) {
       //Dish dish = new Dish();
        //System.out.println(dish);
        DailyMenu dish = new DailyMenu(new Dish("krem",(short)120),new Dish("supa",(short)200),
                new Dish("musaka",(short)120));

        System.out.println(dish);
    }
}
