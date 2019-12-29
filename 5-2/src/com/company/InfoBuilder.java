package com.company;

public class InfoBuilder {

    private String username;
    private String password;
    private String address;
    private String phoneNumber;
    private String education;
    private int age;

    public InfoBuilder(String username,String password,String address,String phoneNumber,String education,int age){
        this.username=username;
        this.password=password;
        this.address=address;
        this.phoneNumber=phoneNumber;
        this.education=education;
        this.age=age;
    }
    public InfoBuilder(){}

    public InfoBuilder setUsername(String username){
        this.username=username;
        return this;
    }
    public InfoBuilder setpassword(String password){
        this.password=password;
        return this;
    }
    public InfoBuilder setAddress(String address){
        this.address=address;
        return this;
    }
    public InfoBuilder setPhonenumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
        return this;
    }
    public InfoBuilder setEducation(String education){
        this.education=education;
        return this;
    }
    public InfoBuilder setAge(int age){
        this.age=age;
        return this;
    }
}
