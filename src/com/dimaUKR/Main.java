package com.dimaUKR;

public class Main {
/*
    пам'ятка

    Абстракції
    Інкапсуляція
    Наслідування
    Поліморфізм

    Абстракція це властивості обекту які не є обовязкові для усих обектів данного классу=) ось як))
    Інкапсуляція модифікатори доступу паблік прайвет
 */
    public static void main(String[] args) {
        Person dima = new Person();
        System.out.println("Рост Дмитро: "+dima.height);

        Person vasiliy = new Person();
        vasiliy.height=190;
        System.out.println("Рост Василя: "+vasiliy.height);
        vasiliy.say("Діма");

        PersonConstructor ivan = new PersonConstructor(110);
        System.out.println("Рост Івана: "+ivan.height);

        PersonConstructor sergey = new PersonConstructor();
        System.out.println("Рост Сергія: "+sergey.height);

        PersonConstructor Andrey = new PersonConstructor(140,"Андрій");
        System.out.println("Рост "+Andrey.name+": "+Andrey.height);

        Student maxim = new Student(101,"Max",2);
        maxim.tell();
        System.out.println("course="+maxim.course);

        Shape[] arr = new Shape[] {new Circle(),new Square(),new Triangle()};

        for (int i=0;i<arr.length;i++){
            arr[i].draw();
        }

        Computer mycomp = new Computer();
        mycomp.i3.start();
        mycomp.kingston.start();


        Car BMW=new Car();
        BMW.setObem(4.0f,"BMW");

        Car Mers = new Car();
        Mers.setObem(1.3f,"mers");

        new Computer(){
          void superComp(){
              this.i3.shutdown();
              this.kingston.shutdown();
          }
        };

        ShapeAbstr circle = new CircleAb();
        circle.draw();

    }


}
