package com.qa;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println(sayHello());
        System.out.println(sayHelloToSomeone("Peter"));
        System.out.println(sayHelloToSomeone("Bob"));
        System.out.println(sayHelloToSomeone("Charlie"));
        System.out.println(sayHelloToSomeone("Peter M"));
        System.out.println(sayGoodbye());
        System.out.println(sayHelloToSomeone("Pepper2"));;
    
    
    
    }

    public static String sayHello() {
        return "Hello World!";
    }

    public static String sayGoodbye() {
        return "Hello happy  World!";
    }

    public static String sayHelloToSomeone(String name) {
        return "Hello from " + name;
    }
}
