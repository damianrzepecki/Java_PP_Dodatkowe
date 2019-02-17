package zadania;

import controller.Controller;
import tableTablica.Tablica;

import java.util.Arrays;
import java.util.Scanner;

public class Task_06 {
    public static int task(){
        do {
            System.out.println("6.  Znajdź najmniejsząi największą liczbę w tabeli N liczb całkowitych. ");
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
            int minValue = userTable[0];
            int maxValue = userTable[0];
            if(userTable.length == 1){
                System.out.printf("Tablica składa się tylko z jednego elementu");
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
            }while(Controller.runTaskAgain());
        return -1;
    }
}
