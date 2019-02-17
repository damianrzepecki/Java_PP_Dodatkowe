package zadania;
/*
import controller.Controller;
import tableTablica.Tablica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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
            Scanner scanner = new Scanner(System.in);
            while (!scanner.hasNextInt()) {
                System.out.println("Ile najmniejszych liczb zsumować");
                scanner.next();
            }
            int lookFor = scanner.nextInt();
            if (lookFor > userTable.length) {
                System.out.println("Liczba \"najmniejszych\" nie może być większa niż liczba elementów w tablicy");
            } else {
                ArrayList newArray = new ArrayList();
                for(int i=0;i<userTable.length;i++){
                    newArray.add(userTable[i]);
                }userTable
            }







/*
            int minValueSecond = userTable[0];
            int minValueFirst = userTable[0];
            if(userTable.length == 1){
                System.out.printf("Tablica składa się tylko z jednego elementu\n");
            }else if(userTable.length == 2){
                minValueSecond = userTable[1];
                minValueFirst = userTable[0];
                int sum = minValueSecond+minValueFirst;
                System.out.printf("Najmniejsza suma 2 liczb w tej tabeli to \"%s\" Liczby - \"%s\" i \"%s\"\n",sum,minValueFirst,minValueSecond);
            }else{
                // Niestety też znalezione na StackOverflow
                for(int i=1; i<userTable.length;i++) {
                    if (minValueFirst > userTable[i]) {
                        minValueSecond = minValueFirst;
                        minValueFirst = userTable[i];
                    } else if (userTable[i] <= minValueSecond && userTable[i] >= minValueFirst){
                        minValueSecond = userTable[i];
                    }
                }
            }
            int sum = minValueSecond+minValueFirst;
            System.out.printf("Najmniejsza suma 2 liczb w tej tabeli to \"%s\" Liczby - \"%s\" i \"%s\"\n",sum,minValueFirst,minValueSecond);
        }while(Controller.runTaskAgain());
        return -1;

                int minValue = userTable[0];
                int maxValue = userTable[0];
                if(userTable.length == 1){
                System.out.printf("Tablica składa się tylko z jednego elementu\n");
                }else{

                for(int i=1; i<userTable.length;i++){
        if(maxValue <= userTable[i])
        maxValue = userTable[i];
        }
        for(int i=1; i<userTable.length;i++){
        if(minValue >= userTable[i])
        minValue = userTable[i];
        }
        }
        System.out.printf("\nMax wartość = %d , Min wartość = %d\n",maxValue,minValue);

                } while (Controller.runTaskAgain()) ;
                return -1;
            }
        }
    }
    */