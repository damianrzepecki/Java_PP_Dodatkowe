package zadania;

import controller.Controller;
import static tableTablica.Tablica.userTable;

public class Task_06 {
    public static int task(){
        do {
            System.out.println("6.  Znajdź najmniejsząi największą liczbę w tabeli N liczb całkowitych. ");
            System.out.println("\n\nCzy chcesz stworzyć tablicę sam, czy chcesz wygenerować tablicę?\n1. Wygeneruj\n2. Stwórz sam\n0. Wyłącz program");

            int[] userTable = userTable();

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
            }while(Controller.runTaskAgain());
        return -1;
    }
}
