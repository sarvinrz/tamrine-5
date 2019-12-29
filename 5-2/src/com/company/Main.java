package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner( System.in );
        InfoBuilder infoBuilder=new InfoBuilder(  ){};

        System.out.println("enter username: ");
        String Username=scanner.nextLine();
        infoBuilder.setUsername( Username );
        System.out.println("enter password: ");
        String password=scanner.nextLine();
        infoBuilder.setpassword( password );
        System.out.println("enter address: ");
        String address=scanner.nextLine();
        infoBuilder.setAddress( address );
        System.out.println("enter phone number: ");
        String phonenumber=scanner.nextLine();
        infoBuilder.setPhonenumber( phonenumber );
        System.out.println("enter your education: ");
        String education=scanner.nextLine();
        infoBuilder.setEducation( education );
        System.out.println("enter age: ");
        String str=scanner.nextLine();
        int age=Integer.parseInt( str );
        infoBuilder.setAge( age );


    }
}
