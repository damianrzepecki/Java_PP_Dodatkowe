package zadania;

import controller.Controller;
import tableTablica.Tablica;

import java.util.Arrays;
import java.util.Scanner;

public class Task_08 {
    public static int task() {
        do {
            System.out.println("8.  Znajdź najmniejszą sumę kolejnych K elementów w tabeli N liczb całkowitych");
            System.out.println("\n\nCzy chcesz stworzyć tablicę sam, czy chcesz wygenerować tablicę?\n1. Wygeneruj\n2. Stwórz sam\n0. Wyłącz program");
            int[] userTable = new int[0];
            switch (Controller.choice(2)) {
                case 0:
                    System.exit(0);
                case 1:
                    userTable = Tablica.automatic();
                    break;
                case 2:
                    userTable = Tablica.userInput();
                    break;
            }
            System.out.println("\nTwoja tablica to:");
            System.out.print(Arrays.toString(userTable) + "\n");
            if(userTable.length==1){
                System.out.println("Tablica ma tylko jeden element i nie można dla niej przeprowadzić tych obliczeń");
            }else{
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj do któego elementu szukać sumy 2 najmniejszych liczb");
                while (!scanner.hasNextInt()) {
                    System.out.println("Podaj liczbę całkowitą");
                    scanner.next();
                }
                int lookFor = scanner.nextInt();
                if (lookFor > userTable.length) {
                    System.out.println("Liczba nie może być większa niż długość listy");
                } else {
                    int[] tableMore = new int[lookFor];
                    for (int i = 0; i < lookFor; i++) {
                        tableMore[i] = userTable[i];
                    }

                    int minValueSecond = tableMore[0];
                    int minValueFirst = tableMore[0];
                    if (tableMore.length == 1) {
                        System.out.printf("Tablica składa się tylko z jednego elementu - nie można wykonać obliczeń\n");
                    } else if (tableMore.length == 2) {
                        minValueSecond = tableMore[1];
                        minValueFirst = tableMore[0];
                        int sum = minValueSecond + minValueFirst;
                        System.out.printf("Najmniejsza suma 2 liczb w tej tabeli to \"%s\" Liczby - \"%s\" i \"%s\"\n", sum, minValueFirst, minValueSecond);
                    } else {

                        // Niestety też znalezione na StackOverflow
                        for (int j = 1; j < tableMore.length; j++) {
                            if (minValueFirst > tableMore[j]) {
                                minValueSecond = minValueFirst;
                                minValueFirst = tableMore[j];
                            }else if (tableMore[j] >= minValueSecond && tableMore[j] <= minValueFirst) {
                                minValueSecond = tableMore[j];
                            }
                        }
                    }
                    int sum = minValueSecond + minValueFirst;
                    System.out.printf("Najmniejsza suma 2 liczb w tej tabeli to \"%s\" Liczby - \"%s\" i \"%s\"\n", sum, minValueFirst, minValueSecond);
                }
            }
        } while (Controller.runTaskAgain());
        return -1;
    }
}

