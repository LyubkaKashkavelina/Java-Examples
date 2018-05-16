package com.company;

public class Main {

    public static void main(String[] args) {
        //String[] inputArray = new String[]{"bmw","audi","aston"};
        Cars[] output = new Cars[3];
        output[0] = new Cars("bmw","i8","black",720,"3.0","automatic",
                "2015");
        char givenChar = 'm';



        System.out.println(cleanArrayOfCars(output,givenChar));

        //System.out.println(outputArray.cleanArrayOfCars(inputArray,givenChar));//cleanArrayOfCars(inputArray,givenChar));

    }
}