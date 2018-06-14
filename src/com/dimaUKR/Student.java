package com.dimaUKR;

public class Student extends PersonConstructor{
    int course = 1;

    public Student (int height, String manName, int course){
        super(height,manName);
        this.course = course; // ключове слово this яке вказуе на змінну классу а не конструктора
    }
    public void tell(){
        System.out.println("Student:"+super.name);
    }
}
