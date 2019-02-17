package zadania;

import controller.Controller;
import tableTablica.Tablica;

import java.util.Arrays;
import java.util.Scanner;

public class Task_03 {
    public static int task(){
        do {
            System.out.println("3. Znajdź różnicę między liczbami większymi i mniejszymi od K w tabeli liczb całkowitych ");
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
            System.out.println("\n\nPodaj Liczbę która podzieli tablicę na wartości mniejsze i większe od szukanej liczby");
            Scanner scanner = new Scanner(System.in);

            while (!scanner.hasNextInt()) {
                System.out.println("Podaj liczbę całkowitą");
                scanner.next();
            }
            int lookFor = scanner.nextInt();

            if (userTable.length == 1) {
                System.out.printf("Tablica składa się tylko z jednego elementu");
                if (lookFor == userTable[0]) {
                    int x = userTable[0];
                    System.out.printf("\nSzukana liczba \"%s\" jest równa liczibe z tabeli (\"%s\")\n", lookFor, x);
                } else if (lookFor < userTable[0]) {
                    int x = userTable[0];
                    System.out.printf("\nSzukana liczba \"%s\" jest mniejsza niż liczba z tabeli (\"%s\")\n", lookFor, x);
                } else {
                    int x = userTable[0];
                    System.out.printf("\nSzukana liczba \"%s\" jest większa niż liczba z tabeli(\"%s\")\n", lookFor, x);
                }
            } else {
                int counterMore = -1;
                int counterLess = -1;
                for (int i = 0; i < userTable.length; i++) {
                    if (lookFor > userTable[i]) {
                        counterMore += 1;
                    }
                }
                for (int i = 0; i < userTable.length; i++) {
                    if (lookFor < userTable[i]) {
                        counterLess += 1;
                    }
                }
                if(counterMore == -1){
                    System.out.printf("Nie ma elementów większych od wskazanej liczby (\"%s\")\n",lookFor);
                }else{
                    int[] tableMore = new int[counterMore+1];
                    int j = 0;
                    for (int i = 0; i < userTable.length; i++) {
                        if (lookFor > userTable[i]) {
                            tableMore[j] = userTable[i];
                            j += 1;
                        }
                    }
                    System.out.print("Liczby większe niż "+lookFor+" to:");
                    System.out.println(Arrays.toString(tableMore));
                }
                if(counterLess == -1){
                    System.out.printf("Nie ma elementów mniejszych od wskazanej liczby (\"%s\")\n",lookFor);
                    break;
                }else{
                    int k = 0;
                    int[] tableLess = new int[counterLess+1];
                    for (int i = 0; i < userTable.length; i++) {
                        if (lookFor < userTable[i]) {
                            tableLess[k] = userTable[i];
                            k += 1;
                        }
                    }
                    System.out.print("Liczby mniejsze niż "+lookFor+" to:");
                    System.out.println(Arrays.toString(tableLess));
                }

            }

        }while(Controller.runTaskAgain());


        return -1;
    }
}

