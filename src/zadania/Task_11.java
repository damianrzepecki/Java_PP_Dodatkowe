package zadania;

import controller.Controller;
import tableTablica.Tablica;

import java.util.Arrays;

public class Task_11 {
    public static int task() {
        do {
            System.out.println("11. Oblicz ile liczb w tablicy (liczby całkowite) jest mniejszych od średniej wszystkich liczb w tablicy. ");
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
            int minValue = userTable[0];
            int maxValue = userTable[0];
            if (userTable.length == 1) {
                System.out.printf("Tablica składa się tylko z jednego elementu");
            } else {
                int sum = 0;
                for (int i : userTable) {
                    sum += i;
                }
                int x = sum / userTable.length;
                int[] newTable = new int[userTable.length];
                int counter = 0;
                for (int i = 0; i < userTable.length; i++) {
                    if (x > userTable[i]) {
                        newTable[counter] = userTable[i];
                        counter += 1;

                    }
                }
                System.out.printf("\nOd średniej wartości tablicy wynoszącej \"%s\" mniejszą wartość ma \"%s\" liczb\n",x,counter);
                System.out.println(Arrays.toString(newTable));

            }
        } while (Controller.runTaskAgain());
        return -1;
    }
}
