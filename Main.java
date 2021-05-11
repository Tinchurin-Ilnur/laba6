package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Animal zoo = new Animal();
        zoo.makeNoise();
        Veterinar doctor = new Veterinar();
        doctor.treatAnimal();
    }
}
class Animal {

    public void makeNoise() {
        Scanner in = new Scanner(System.in);
        System.out.println("Write food");
        String food = in.nextLine();
        System.out.println("Write location");
        String location = in.nextLine();
        System.out.print(food+"\n"+location);

    }
    public void eat() {
        System.out.println("ест");

    }
    public void sleep(){
        System.out.println("спит");
    }
}
class Dog extends Animal {
    String Dog1 = "this.Dog1";
    @Override
    public void makeNoise() {
        String Dog1 = new String("not sleep");
    }
    @Override
    public void eat(){
        String Dog1 = new String("eat");
    }
}
class Cat extends Animal {
    String Cat1 = "this.Cat1";

    @Override
    public void makeNoise() {
        String Cat1 = new String("not sleep");

    }

    @Override
    public void eat() {
        String Cat1 = new String("eat");
    }
}
class Horse extends Animal {
    String Horse1 = "this.Horse1";


    @Override
    public void makeNoise() {
        String Horse1 = new String("not sleep");

    }

    @Override
    public void eat() {
        String Horse1 = new String("eat");
    }
}
class Veterinar{
    public void treatAnimal(){
        Animal cat1 = new Cat();
    }
}
