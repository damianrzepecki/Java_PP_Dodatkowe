package zadania;

import controller.Controller;
import java.util.ArrayList;
import java.util.List;
import static tableTablica.Tablica.userTable;

public class Task_11 {
    public static int task() {
        do {
            System.out.println("11. Oblicz ile liczb w tablicy (liczby całkowite) jest mniejszych od średniej wszystkich liczb w tablicy. ");
            System.out.println("\n\nCzy chcesz stworzyć tablicę sam, czy chcesz wygenerować tablicę?\n1. Wygeneruj\n2. Stwórz sam\n0. Wyłącz program");

            int[] userTable = userTable();

            if (userTable.length == 1) {
                System.out.println("Tablica składa się tylko z jednego elementu\n");
            } else {
                int sum = 0;
                for (int i : userTable) {
                    sum += i;
                }
                int x = sum / userTable.length;
                List<Integer> newTable = new ArrayList<>();

                int counter = 0;
                for (int i = 0; i < userTable.length; i++) {
                    if (x > userTable[i]) {
                        newTable.add(userTable[i]);
                        counter += 1;

                    }
                }
                System.out.printf("\nOd średniej wartości tablicy wynoszącej \"%s\" mniejszą wartość ma \"%s\" liczb\n",x,counter);
                System.out.println(newTable);

            }
        } while (Controller.runTaskAgain());
        return -1;
    }
}
