package zadania;

import controller.Controller;
import java.util.*;
import static tableTablica.Tablica.userTable;

public class Task_07 {
    public static int task(){
        do {
            System.out.println("7.  Znajdź wszystkie pary liczb, których suma jest równa danej liczbie K (bez sortowania). ");
            System.out.println("\n\nCzy chcesz stworzyć tablicę sam, czy chcesz wygenerować tablicę?\n1. Wygeneruj\n2. Stwórz sam\n0. Wyłącz program");

            int[] userTable = userTable();

            if (userTable.length == 1) {
                System.out.printf("Tablica składa się tylko z jednego elementu i nie mozna dla niej przeprowadzic obliczen\n");
            } else {
                System.out.println("\n\nPodaj liczbę całkowitą - dla której będziemy szukali sumy dwóch liczb");
                Scanner scanner = new Scanner(System.in);
                while (!scanner.hasNextInt()) {
                    System.out.println("Podaj liczbę całkowitą - dla której będziemy szukali sumy dwóch liczb");
                    scanner.next();
                }
                int lookFor = scanner.nextInt();
                HashSet<String > hash = new HashSet<>();
                String result = null;
                for (int i = 0; i < userTable.length; i++) {
                    for (int j = 0; j < userTable.length; j++) {
                        if ((i != j) && (i != (userTable.length - 1))) {
                            if (userTable[i] + userTable[j] == lookFor) {
                                int x = userTable[i];
                                int y = userTable[j];
                                result = String.format("Szukana przez Ciebie liczba \"%s\" jest sumą liczb \"%s\" oraz \"%s\"\n", lookFor, x, y);
                                hash.add(result);
                            }
                        }
                    }
                }
                if (result == null) {
                    System.out.println("Taka suma nie istnieje");

                }else if (result != null){
                System.out.println(hash);
                }
                //System.out.println(build);
            /*Po poznaniu HashSet usuniete
            Znalezione na StacOverflow
            Usuwa zduplikowane linie


                String s = build.toString();
                String[] tokens = s.split("\n");
                StringBuilder resultBuilder = new StringBuilder();
                Set<String> alreadyPresent = new HashSet<String>();

                boolean first = true;
                for (String token : tokens) {

                    if (!alreadyPresent.contains(token)) {
                        if (first) first = false;
                        else resultBuilder.append("\n");

                        if (!alreadyPresent.contains(token))
                            resultBuilder.append(token);
                    }

                    alreadyPresent.add(token);
                }
                String resulty = resultBuilder.toString();
                System.out.println(resulty);
                */
            }

        }while(Controller.runTaskAgain());
        return -1;
    }
}
