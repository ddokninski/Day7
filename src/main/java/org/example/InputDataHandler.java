package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDataHandler {

    public int getIntFromUser(String msg) {
        try {
            Scanner scanner = new Scanner(System.in);
            int intFromUser;
            do {
                System.out.println(msg);
                intFromUser = scanner.nextInt();
            } while (intFromUser <= 0);
            return intFromUser;
        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data, try again");
            throw new InputMismatchException();
        }
    }

    public String getTextFromUser(String msg) {
        try {
            Scanner scanner = new Scanner(System.in);
            String textFromUser;
            do {
                System.out.println(msg);
                textFromUser = scanner.next();
            } while (textFromUser.isEmpty());
            return textFromUser;
        } catch (InputMismatchException e) {
            System.out.println("Incorrect Data, try again");
            throw new InputMismatchException();
        }
    }
}
