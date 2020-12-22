/* Zaprojektuj klasę Dice, która reprezentuje wynik rzutu kostką.
 • Klasa powinna umożliwiać stworzenie obiektu z konkretnym rezultatem
 przekazanym w konstruktorze.
 • Klasa musi udostępniać metodę reprezentującą „napisową” reprezentację
 obiektu.
 • np. dla wyniku 3 ma wyświetlać [3]*/


package com.infoshare;

public class Dice {

    int throwByDice;

    public int diceThrow(int throwByDice) {
        return throwByDice;
    }

}
