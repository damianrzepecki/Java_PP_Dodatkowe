package zadania;

import controller.Controller;
import static tableTablica.Tablica.userTable;

public class Task_09 {
    public static int task(){
        do {
            System.out.println("9.  Znajdź ile razy występują ciągi powtarzających się liczb ");
            System.out.println("\n\nCzy chcesz stworzyć tablicę sam, czy chcesz wygenerować tablicę?\n1. Wygeneruj\n2. Stwórz sam\n0. Wyłącz program");

            int[] userTable = userTable();

int j = 0;
            int i = 0;
            int counter = 0;
            boolean check = true;
            if(userTable.length==1){
                System.out.println("Jedno elementowa lista nie zawiera ciągów.");
            }else {
                while (check) {
                    do {
                        if (userTable[i] == userTable[j]) {
                            j++;
                        } else if (userTable[i] != userTable[j]) {
                            if (i - j != -1) {
                                counter += 1;
                                i = j;
                            } else
                                i = j;
                        }
                    } while (j < userTable.length);
                    if (userTable[userTable.length - 2] == userTable[userTable.length - 1]) {
                        counter += 1;
                    }
                    check = false;
                }


            }if(counter==0)
                    System.out.printf("\nW liscie nie ma ciągów powtarzających się liczb");
            else if(counter==1)
                    System.out.printf("\nW liscie znajduje się \"%s\" ciąg\n", counter);
            else
                    System.out.printf("\nW liscie znajduje się \"%s\" ciągów\n", counter);

        } while (Controller.runTaskAgain());
        return -1;
    }
}

