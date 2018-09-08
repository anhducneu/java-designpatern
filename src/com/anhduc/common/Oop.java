/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhduc.common;

/**
 *
 * @author anhduc
 */
class Animal {
    protected String name;
    
    public Animal(String name) {
      System.out.println("Constructing an Employee");
      this.name = name;
   }
    
    public void move(){
        System.out.println("Animal move: " + name);
    }    
}

class Dog extends Animal{
    
    private int numLeg;

    public Dog(String name, int num) {
        super(name);
        this.numLeg = num;
    }

    
    public void move(){
        System.out.println("Dog move: " + name);
    }
    
    public void bark(){
        System.out.println("Dog bark go go go");
    }
}

//class Deer extends Animal implements Vegetarian{
//    public void move(){
//        System.out.println("Dog move");
//    }
//    
//    public void bark(){
//        System.out.println("Dog bark go go go");
//    }
//    
//}

interface Vegetarian{}


public class Oop {

    public static void main(String arg[]){
        
        Dog dog = new Dog("Jack", 2);
        Animal animal = new Dog("Miu", 4);
        
        dog.move();
        animal.move();
        
    }
}

