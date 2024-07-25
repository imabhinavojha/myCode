package org.example;

class abc{
    public void sum(int a, int b) {
        System.out.println("2 sum");
        
    }
    public void sum() {
        System.out.println("no sum");
        
    }
}

//Overloading or Compile-time Polymorphism
public class overloading {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.sum();
    }
    
}
