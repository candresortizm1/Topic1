package com.globant.exercise2;

public class Main {

    public static void main(String[] args) {
        Subscriber s1 = new Subscriber("Uno");
        Subscriber s2 = new Subscriber("Dos");
        Subscriber s3 = new Subscriber("Tres");
        Subscriber s4 = new Subscriber("Cuatro");
        Subscriber s5 = new Subscriber("Cinco");

        Product p1 = new Product1();
        Product p2 = new Product2();
        Product p3 = new Product3();

        p1.attach(s1);
        p2.attach(s1);
        p1.attach(s2);
        p1.attach(s3);
        p1.attach(s4);
        p3.attach(s3);
        p3.attach(s4);
        p3.attach(s5);

        p1.setPrice(5.0F);
        System.out.println("------------");
        p3.setPrice(6.0F);
        System.out.println("------------");

        p1.detach(s2);
        p1.detach(s4);
        p1.attach(s5);
        p3.detach(s4);

        p1.setPrice(4.5F);
        System.out.println("------------");
        p2.setPrice(9.5F);
        System.out.println("------------");
        p3.setPrice(6.5F);
    }
}
