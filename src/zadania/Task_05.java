package zadania;

import controller.Controller;
import tableTablica.Tablica;

import java.util.Arrays;

public class Task_05 {
    public static int task(){
        do {
            System.out.println("5.  Znajdź najmniejszy iloraz dwóch liczb w tabeli N liczb całkowitych. ");
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
            int minValue;
            int maxValue;
            if(userTable.length == 1){
                System.out.println("Tablica składa się tylko z jednego elementu nie można wykonać obliczeń\n");
            }else if(userTable.length == 2){
                minValue = userTable[0];
                maxValue = userTable[1];
                float  iloraz = (float)minValue/maxValue;
                System.out.printf("Największy iloczyn 2 liczb w tej tabeli to \"%.2f\" Liczby - \"%s\" / \"%s\"\n",iloraz,minValue,maxValue);
            }else{
                minValue = userTable[0];
                maxValue = userTable[0];
                for(int i=1; i<userTable.length;i++){
                    if(maxValue <= userTable[i])
                            maxValue = userTable[i];
                    }
                for(int i=1; i<userTable.length;i++){
                        if(minValue >= userTable[i])
                            minValue = userTable[i];
                    }
                float iloraz = (float)minValue/maxValue;
                System.out.printf("Największy iloczyn 2 liczb w tej tabeli to \"%.2f\" Liczby - \"%s\" / \"%s\"\n",iloraz,minValue,maxValue);
            }
        }
        while(Controller.runTaskAgain());
        return -1;
    }
}

