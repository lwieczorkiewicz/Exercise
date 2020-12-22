package com.infoshare;

public class Tab {

    public static void main(String[] args) {

        int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};

        System.out.println("Wszystkie liczby");
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
        }
        System.out.println();

        for (int allNumbers : integers) {
            System.out.print(allNumbers);
        }
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Sześć pierwszych liczb");

        for (int i = 0; i < 6; i++) {
            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println("Sześć ostatnich liczb");

        for (int i = integers.length - 1; i > 3; i--) {
            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println("---------------");
        System.out.println("Wszystkie liczby parzyste");

        for (int parzyste : integers) {
            if (parzyste % 2 == 0) {
                System.out.print(parzyste);
            }
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println("Wszystkie cyfry na nieparzystych indeksach");

        for (int i = 0; i < integers.length; i++) {
            if (i % 2 != 0) {
                System.out.print(integers[i]);
            }
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println("Wszystkie liczby od tyłu");

        for (int i = integers.length - 1; i >= 0; i--) {
            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println("--------------------------");
        System.out.println("Wszystkie liczby oprócz 5");

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == 5) {
                continue;
            }
            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println("---------------------");
        System.out.println("Wszystkie cyfry do 7 włącznie");

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] == 7) {
                System.out.println(integers[i]);
                break;
            }
            System.out.print(integers[i]);
        }

        System.out.println();
        System.out.println("------------------");
        System.out.println("Wszystkie liczby podzielone przez 3");

        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 3 == 0) {
                System.out.print(integers[i]);
            }
        }

        System.out.println();
        System.out.println("-------------------");
        System.out.println("Sumę wszystkich cyfr");

        int suma = 0;
        for (int i = 0; i < integers.length; i++) {
            suma += integers[i];
        }
        System.out.println(suma);

        System.out.println();
        System.out.println("----------------");
        System.out.println("Sumę cyfr większych lub równych 4");

        int suma1 = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] >= 4) {
                suma1 += integers[i];
            }
        }
        System.out.print(suma1);

        System.out.println();
        System.out.println("------------------");
        System.out.println("Najwięksżą i najmniejszą liczbę");

        int max = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > max) {
                max = integers[i];
            }
        }
        int min = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] < min) {
                min = integers[i];
            }
        }
        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
    }
}
