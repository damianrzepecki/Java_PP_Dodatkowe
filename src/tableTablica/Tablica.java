package tableTablica;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tablica {
    public static int[] automatic() {
        System.out.println("Losowanie w zakresie 1-100");
        Scanner scanner = new Scanner(System.in);
        while(true){
            try {
                System.out.println("Z ilu elementów ma składać się tablica?");
                int ileElementow = scanner.nextInt();
                if (ileElementow <= 0) {
                    System.out.println("Zła ilość elementów");
                    return automatic();

                } else {
                    int[] tablica = new int[ileElementow];
                    for (int i = 0; i < ileElementow; i++) {
                        System.out.printf("Wprowadz %s element - ", i + 1);
                        Random random = new Random();
                        tablica[i] = random.nextInt();
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