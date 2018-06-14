package com.dimaUKR;

public class PersonConstructor {
    public int height = 180;
    public  String name = "JoshDo";

    public void say(String name){
        System.out.println("Привіт друже "+name+"!");
    }

    public PersonConstructor(){}

    public PersonConstructor(int h){
            height = h;
    }
    public PersonConstructor(int h, String manName){
        name = manName;
        height = h;
    }


}

