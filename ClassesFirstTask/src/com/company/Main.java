package com.company;

public class Main {

    public static void main(String[] args) {
       CompanyET info = new CompanyET("nestle","12.12.1985","1212160800","john",
               100.0,300.0);
        info.getProfit();
        System.out.println(info);
       System.out.println(info.getProfit());



    }
}
