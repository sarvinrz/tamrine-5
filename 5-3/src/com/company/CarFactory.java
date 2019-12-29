package com.company;

public class CarFactory  {
    public static Car getCar(int c){
        switch (c){
            case 1: return new  BMW();
            case 2: return new Benz();
            case 3: return new Kia();
            case 4: return new Honda();
            default: return null;
        }
    }
}
