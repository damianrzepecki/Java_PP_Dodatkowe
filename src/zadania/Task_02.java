package zadania;

import controller.Controller;
import tableTablica.Tablica;

import java.util.Arrays;
import java.util.Scanner;

public class Task_02 {
    public static int task(){
    do {
        System.out.println("2.  Znajdź ile liczb K występuje w tabeli N liczb całkowitych. ");
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
        System.out.println("\n\nPodaj Liczbę którą chcesz wyszukać w tablicy");
        Scanner scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()){
            System.out.println("Podaj liczbę całkowitą");
            scanner.next();
        }int lookFor = scanner.nextInt();
        int counter = 0;
        for(int i=0; i<userTable.length;i++){
            if(userTable[i] == lookFor) {
                counter += 1;
            }
        }

        if (counter == 0){
            System.out.println("Szukanej prze Ciebie liczby nie ma w tablicy");
        }else {
            System.out.printf("Szukana przez Ciebie liczba \"%d\" znajduje się w tablicy - %d razy \n", lookFor, counter);
        }
    }while(Controller.runTaskAgain());
    return -1;
    }
}



