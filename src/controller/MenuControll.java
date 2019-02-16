package controller;

public class MenuControll {

    public static String menu() {
       String menu = String.join("\n"
                ,"\n\nJakie zadanie chcesz uruchomić"
                ,"|=========================================================================================================|"
                ,"|1.  Zadanie pierwsze - Znajdź indeks liczby K w tabeli liczb całkowitych A o rozmiarze N.                |"
                ,"|2.  Znajdź ile liczb K występuje w tabeli N liczb całkowitych.                                           |"
                ,"|3.  Znajdź różnicę między liczbami większymi i mniejszymi od K w tabeli liczb całkowitych                |"
                ,"|4.  Znajdź największy iloczyn dwóch liczb w tabeli N liczb całkowitych.                                  |"
                ,"|5.  Znajdź najmniejszy iloraz dwóch liczb w tabeli N liczb całkowitych.                                  |"
                ,"|6.  Znajdź najmniejsząi największą liczbę w tabeli N liczb całkowitych.                                  |"
                ,"|7.  Znajdź wszystkie pary liczb, których suma jest równa danej liczbie K (bez sortowania).               |"
                ,"|8.  Znajdź najmniejszą sumę kolejnych K elementów w tabeli N liczb całkowitych                           |"
                ,"|9.  Znajdź ile razy występują ciągi powtarzających się liczb                                             |"
                ,"|10. Znajdź najmniejszą sumę K liczb w tabeli N liczb całkowitych (bez sortowania)                        |"
                ,"|11. Oblicz ile liczb w tablicy (liczby całkowite) jest mniejszych od średniej wszystkich liczb w tablicy.|"
                ,"|=========================================================================================================|"
                ,"0. Wyjdź z programu");
       System.out.println(menu);
       return menu;

    }




}
