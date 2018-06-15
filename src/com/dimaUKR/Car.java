package com.dimaUKR;

public class Car {
    private float obem = 1;
    String Name;

    public void setObem(float obem, String name) {
        this.obem = obem;
        this.Name = name;
        System.out.println("Объем "+name+" = "+obem);
    }
}
