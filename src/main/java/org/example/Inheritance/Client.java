package org.example.Inheritance;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
//        User u = new User();
        Student s = new Student("MorningBatch");
        s.gradYear = 2019;
        s.doSomething();

//        s.name = "Akas";
////        s.id = 1; // Private can't be accessed
//        s.age = 10;
//        s.gradYear = 19823;
        System.out.println("Debug");

    }
}
