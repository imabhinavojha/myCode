package org.Interviewbit.Other;

class Sample {
    Sample name() {
        return this;
    }

    void foo() {
        System.out.println("Inside foo function");
    }

}

public class thisInstance {
    public static void main(String[] args) {
        Sample sp = new Sample();
        sp.name().foo();

    }

}
