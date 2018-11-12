package com;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        car.listen();
    }
}
class Telega{
    int wheels =4;
}
// is a = ?
class Car extends Radio{
    //has a
    Radio radio=new Radio();
    void liste(){radio.listen();}
    int wheels =4;
    void drive(){}
}
// has a ?
class Radio{
    void listen(){
        System.out.println("listen radio");
    }
}










