package tableTablica;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tablica {
    public static int[] automatic() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Z ilu elementów ma składać się tablica?");
                int ileElementow = scanner.nextInt();
                if (ileElementow <= 0) {
                    System.out.println("Zła ilość elementów");
                    return automatic();
                } else {
                    System.out.println("Podaj zakres losowania elementów");
                    System.out.print("Od - ");
                    int min = scanner.nextInt();
                    System.out.print("Do- ");
                    int max = scanner.nextInt();
                    System.out.println();
                    if (min<=max){
                        int[] tablica = new int[ileElementow];
                        for (int i = 0; i < ileElementow; i++) {
                            Random random = new Random();
                            tablica[i] = random.nextInt((max - min) + 1) + min;
                    }return tablica;
                    }else{
                        System.out.println("Zakres musi być poprawny wartość początkowa nie może być większa od wartości końcowej!");
                        break;
                    }
                }
            }catch(InputMismatchException exception) {
                System.out.println("Wrowadzone przec Ciebie dane są niepoprawne, losowanie zacznie się ponownie");
                scanner.next();
            }
        }
        return new int[0];
    }

    public static int[] userInput() {
            Scanner scanner = new Scanner(System.in);
            while(true){
                try {
                    System.out.println("Z ilu elementów ma składać się tablica?");
                    int ileElementow = scanner.nextInt();
                    if (ileElementow <= 0) {
                        System.out.println("Zła ilość elementów");
                        return userInput();

                    } else {
                        int[] tablica = new int[ileElementow];
                        for (int i = 0; i < ileElementow; i++) {
                            System.out.printf("Wprowadz %s element - ", i + 1);
                            while (!scanner.hasNextInt()) {
                                System.out.println("Proszę wprowadź poprawny element - Liczbę całkowitą");
                                scanner.next();
                                System.out.printf("Wprowadz %s element - ", i + 1);
                            }
                            tablica[i] = scanner.nextInt();
                        }
                        return tablica;
                    }
                }catch(InputMismatchException exception) {
                    System.out.println("Wprowadź liczbę całkowitą");
                    scanner.nextInt();
                }
                    return new int[0];
            }
    }
}