package com.johnnyDev;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("getting started");
//        LocalDate now = LocalDate.now();
//        System.out.println(now.getMonth());
//        System.out.println(now.getYear());
//        System.out.println(now.getDayOfMonth());

        Person alex = new Person("alex");
        Person mariam = alex;

        System.out.println("Before changing the name alex");
        System.out.println(alex.name + " " + mariam.name);

        alex.name = "Alexander";

        System.out.println();
        System.out.println("After changing the names");
        System.out.println(alex.name + " " + mariam.name);

        System.out.println("hey ".concat(" whaat? ").concat("This Works!"));

        System.out.println(Math.max(3,5));
        System.out.println(Math.abs(-348));
        System.out.println((int) Math.pow(4,2));
        System.out.println((int) Math.sqrt(25));
        System.out.println(!!true);
        int num = 2;
        System.out.println(num++);
        System.out.println(num);


        // THE SCANNER CLASS
        Scanner scanner = new Scanner(System.in);
        System.out.println("say something");
        String something = scanner.nextLine();
        System.out.println("You said: " + something);
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("You were born in " + year);


        Lens lensOne = new Lens("sony", "85mm", true);
        Lens lensTwo = new Lens("cannon", "34-70mm", false);
        System.out.println(lensOne);
        System.out.println(lensTwo);

    }

    static class Lens {
        String brand;
        String focalLength;
        boolean isPrime;

        Lens(String brand, String focalLength, boolean isPrime) {
            this.brand = brand;
            this.focalLength = focalLength;
            this.isPrime = isPrime;
        }

        @Override
        public String toString() {
            return "Lens{" + "brand='" + brand + '\'' + ", focalLength='" + focalLength + '\'' + ", isPrime=" + isPrime + '}';
        }
    }



    static class Person {

        String name;
        Person (String name){
            this.name = name;
        }
    }
}
