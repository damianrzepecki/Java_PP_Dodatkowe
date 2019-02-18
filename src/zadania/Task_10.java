package zadania;

import controller.Controller;
import tableTablica.Tablica;

import java.util.*;

import static controller.Controller.userInputNumber;

public class Task_10 {
    public static int task() {
        do {
            System.out.println("10. Znajdź najmniejszą sumę K liczb w tabeli N liczb całkowitych (bez sortowania) ");
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
            System.out.println("Ile najmniejszych elementów zsumować");
            int lookFor = userInputNumber();
                if (lookFor > userTable.length) {
                    System.out.println("Liczba \"najmniejszych\" nie może być większa niż liczba elementów w tablicy");
                } else {
                    List<Integer> newList = new ArrayList<>();
                    List<Integer> finalList = new ArrayList<>();
                    for (int i = 0; i < userTable.length; i++) {
                        newList.add(userTable[i]);
                    }
                    int counter = 0;
                    do {
                        finalList.add(Collections.min(newList));
                        int i = newList.indexOf(Collections.min(newList));
                        newList.remove(i);
                        counter += 1;
                    } while (counter < lookFor);
                    int sum = 0;
                    for (int element : finalList) {
                        sum += element;
                    }
                    System.out.printf("\nSuma %s najmniejszych liczb Twojej listy wynosi: %s\n", lookFor, sum);
                }
        }while (Controller.runTaskAgain());
        return -1;
    }
}

