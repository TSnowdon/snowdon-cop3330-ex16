import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Tyler Snowdon
 */
public class App {

    private static final int LEGAL_DRIVING_AGE = 16;

    public static void main(String[] args) {
        int age;

        Scanner reader = new Scanner(System.in);
        System.out.print("What is your age? ");
        try {
            age = reader.nextInt();
            System.out.println(age >= LEGAL_DRIVING_AGE ? "You are old enough to legally drive." : "You are not old enough to legally drive.");
        } catch (Exception e) {
            System.out.println("Invalid input, please restart the program and try a different value.");
        }
    }
}
