package org.example;

class def {
    public void sum() {
        System.out.println("calss def");

    }
}


class ghi extends def {
    public void sum() {
        System.out.println("calss ghi");

    }
}


// Overloading or Compile-time Polymorphism
public class overriding {
    public static void main(String[] args) {
        def obj = new ghi();
        obj.sum();
    }

}
