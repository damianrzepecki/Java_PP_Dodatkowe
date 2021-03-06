package zadania;

import controller.Controller;
import static controller.Controller.userInputNumber;
import static tableTablica.Tablica.userTable;

public class Task_08 {
    public static int task() {
        do {
            System.out.println("8.  Znajdź najmniejszą sumę kolejnych K elementów w tabeli N liczb całkowitych");
            System.out.println("\n\nCzy chcesz stworzyć tablicę sam, czy chcesz wygenerować tablicę?\n1. Wygeneruj\n2. Stwórz sam\n0. Wyłącz program");

            int[] userTable = userTable();

            if(userTable.length==1){
                System.out.println("Tablica ma tylko jeden element i nie można dla niej przeprowadzić tych obliczeń");
            }else{
                System.out.println("Ile najmniejszych elementów zsumować");
                int lookFor = userInputNumber();
                if (lookFor > userTable.length){
                    System.out.println("Liczba nie może być większa niż długość listy");
                } else {
                    int[] tableMore = new int[lookFor];
                    for (int i = 0; i < lookFor; i++) {
                        tableMore[i] = userTable[i];
                    }

                    int minValueSecond = tableMore[0];
                    int minValueFirst = tableMore[0];
                    if (tableMore.length == 1) {
                        System.out.printf("Tablica składa się tylko z jednego elementu - nie można wykonać obliczeń\n");
                    } else if (tableMore.length == 2) {
                        minValueSecond = tableMore[1];
                        minValueFirst = tableMore[0];
                        int sum = minValueSecond + minValueFirst;
                        System.out.printf("Najmniejsza suma 2 liczb w tej tabeli to \"%s\" Liczby - \"%s\" i \"%s\"\n", sum, minValueFirst, minValueSecond);
                    } else {

                        //znalezione na StackOverflow
                        for (int j = 0; j < tableMore.length; j++) {
                            if (tableMore[j] < minValueFirst){
                                minValueSecond = minValueFirst;
                                minValueFirst = tableMore[j];
                            }else if (tableMore[j] < minValueSecond) {
                                minValueSecond = tableMore[j];
                            }
                        }
                    }
                    int sum = minValueSecond + minValueFirst;
                    System.out.printf("Najmniejsza suma 2 liczb w tej tabeli to \"%s\" Liczby - \"%s\" i \"%s\"\n", sum, minValueFirst, minValueSecond);
                }
            }
        } while (Controller.runTaskAgain());
        return -1;
    }
}

