package com.company;

public class Main {

    public static void main(String[] args) {

        Car BMW=CarFactory.getCar( 1 );
        BMW.Info();

        Car Benz=CarFactory.getCar( 2 );
        Benz.Info();

        Car Kia=CarFactory.getCar( 3 );
        Kia.Info();

        Car Honda=CarFactory.getCar( 4 );
        Honda.Info();

    }
}
