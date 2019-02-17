package zadania;


import controller.Controller;
import tableTablica.Tablica;

import java.util.*;

public class Task_07 {
    public static int task(){
        do {
            System.out.println("7.  Znajdź wszystkie pary liczb, których suma jest równa danej liczbie K (bez sortowania). ");
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
                System.out.println("Podaj liczbę całkowitą - dla której będziemy szukali sumy dwóch liczb");
                scanner.next();
            }int lookFor = scanner.nextInt();
            String result = null;
            StringBuilder build = new StringBuilder();
            for(int i=0; i<userTable.length;i++){
                for(int j=0; j<userTable.length;j++){
                    if((i != j) && (i != (userTable.length-1))){
                        if(userTable[i] + userTable[j] == lookFor) {
                            int x = userTable[i];
                            int y = userTable[j];
                            result = String.format("Szukana przez Ciebie liczba \"%s\" jest sumą liczb \"%s\" oraz \"%s\"\n", lookFor, x, y);
                            build.append(result);
                        }
                    }
                }
            }
            //System.out.println(build);
            /*
            Znalezione na StacOverflow
            Usuwa zduplikowane linie
             */

            String s = build.toString();
            String[] tokens = s.split("\n");
            StringBuilder resultBuilder = new StringBuilder();
            Set<String> alreadyPresent = new HashSet<String>();

            boolean first = true;
            for(String token : tokens) {

                if(!alreadyPresent.contains(token)) {
                    if(first) first = false;
                    else resultBuilder.append("\n");

                    if(!alreadyPresent.contains(token))
                        resultBuilder.append(token);
                }

                alreadyPresent.add(token);
            }
            String resulty = resultBuilder.toString();
            System.out.println(resulty);


        }while(Controller.runTaskAgain());
        return -1;
    }
}
