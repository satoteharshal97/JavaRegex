package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

    private final static Scanner scanner = new Scanner(System.in);
    private final static Regex regex = new Regex();

    public static void main(String[] args) {

        System.out.println("Welcome to Java Regex");
        System.out.println("Choose an appropriate option: ");
        boolean check = true;
        while (check) {
            System.out.println("Select:\n" + "1.Check First Name\n" + "2.Exit\n");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    System.out.println("Enter first name:");
                    regex.checkFirstName(scanner.nextLine());
                    break;
                case 2:
                    check = false;
                    break;
                default:
                    System.out.println("Compile Again!");
            }
        }
    }

    private void checkFirstName(String name) {
        boolean value = Pattern.matches("[A-Z]{1}[a-zA-Z]{3,}", name);
        if (value) {
            System.out.println("Valid Name : " + name);
        } else {
            System.out.println("Invalid Name: " + name);
        }
    }
}
