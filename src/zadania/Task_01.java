package zadania;

import controller.Controller;
import tableTablica.Tablica;

import java.util.Arrays;

public class Task_01 {
    public static int task(){
    do {
        System.out.println("1.  Zadanie pierwsze - Znajdź indeks liczby K w tabeli liczb całkowitych A o rozmiarze N. ");
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
        System.out.print(Arrays.toString(userTable)+"\n");
    }while(Controller.runTaskAgain());
        return -1;
    }
}
