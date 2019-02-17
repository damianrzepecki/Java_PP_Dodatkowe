package zadania;

import controller.Controller;
import tableTablica.Tablica;

import java.util.Arrays;

public class Task_04 {
    public static int task(){
        do {
            System.out.println("4.  Znajdź największy iloczyn dwóch liczb w tabeli N liczb całkowitych. ");
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
            int maxValueSecond = userTable[0];
            int maxValueFirst = userTable[0];
            if(userTable.length == 1){
                System.out.printf("Tablica składa się tylko z jednego elementu");
            }else if(userTable.length == 2){
                maxValueSecond = userTable[0];
                maxValueFirst = userTable[1];
                int iloczyn = maxValueFirst*maxValueSecond;
                System.out.printf("Największy iloczyn 2 liczb w tej tabeli to \"%s\" Liczby - \"%s\" i \"%s\"\n",iloczyn,maxValueSecond,maxValueFirst);
            }else{
                // Niestety też znalezione na StackOverflow
                for(int i=1; i<userTable.length;i++) {
                    if (maxValueFirst <= userTable[i]) {
                        maxValueSecond = maxValueFirst;
                        maxValueFirst = userTable[i];
                    } else if (userTable[i] >= maxValueSecond && userTable[i] <= maxValueFirst) {
                        maxValueSecond = userTable[i];
                    }
                }
            }
            int iloczyn = maxValueFirst*maxValueSecond;
            System.out.printf("Największy iloczyn 2 liczb w tej tabeli to \"%s\" Liczby - \"%s\" i \"%s\"\n",iloczyn,maxValueSecond,maxValueFirst);
        }while(Controller.runTaskAgain());
        return -1;
    }
}

