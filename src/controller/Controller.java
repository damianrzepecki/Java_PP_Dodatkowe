package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    public static boolean runAgain() {
        /*
        Method will ask you if You want to run the program again
        Yes = T,t No = N,n
        Other answers will run the method again
         */
        while(true){
            Scanner skanner = new Scanner(System.in);
            System.out.println("\nCzy chcesz ponownie uruchomić program i wybrać zadanie? (T/N)");
            String odp = skanner.nextLine().toUpperCase();
            switch (odp) {
                case "T":
                    return true;
                case "N":
                    System.out.println("Program zostanie zamknięty");
                    return false;
                default:
                    System.out.println("Wprowadziłeś złą zmienna spróbuj jeszcze raz");
            }
        }
    }

    public static boolean runTaskAgain() {
        /*
        Method will ask you if You want to run the program again
        Yes = T,t No = N,n
        Other answers will run the method again
         *//
        while(true){
        Scanner skanner = new Scanner(System.in);
            System.out.println("\nCzy chcesz ponownie uruchomić Zadanie (Z), czy Wyjść z zadania (W)");
            String odp = skanner.nextLine().toUpperCase();
            switch (odp) {
                case "Z":
                    return true;
                case "W":
                    return false;
                default:
                    System.out.println("Wprowadziłeś złą zmienna spróbuj jeszcze raz");
            }
        }
    }
    public static int choice(int x){
        System.out.println("\n\nWprowadź numer");
        Scanner scanner = new Scanner((System.in));
        while (true) {
            try {
                int check = scanner.nextInt();
                while (!(check >= 0) || !(check <=x)) {
                    System.out.println("Podaj poprawny numer");
                    check = scanner.nextInt();
                } return check;

            } catch (InputMismatchException e) {
                System.out.println("Wprowadź liczbę całkowitą");
                scanner.next();
            }
        }
    }

    public static int userInputNumber() {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                int lookFor = scanner.nextInt();
                if (lookFor <= 0) {
                    System.out.println("Zła ilość elementów - spróbuj ponownie");
                }else return lookFor;
            } catch (InputMismatchException exception) {
                System.out.println("Wprowadź liczbę całkowitą");
                scanner.next();
            }
        }
    }
}

// petla wprowadza blad przy liczbie szukanej mniejszej niz wszystkie w tabeli