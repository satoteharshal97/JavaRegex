package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

    private final static Scanner scanner = new Scanner(System.in);
    private final static Regex regex = new Regex();

    public static void main(String[] args) {
        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();
        regex.checkFirstName(firstName);
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
