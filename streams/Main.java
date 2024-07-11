package streams;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.iterate(8, x -> x + 1)
                .filter(x -> x > 100 & x % 5 == 0)
                .map(x -> x * 3)
                .limit(10)
                .forEach(x -> System.out.print(x + " - "));
    }
}
/*
Utwórz strumień kolejnych liczb całkowitych zaczynając od 8
Korzystając z metody filter() wybierz tylko te z nich, które są większe od 100 i podzielne przez 5
Pomnóż liczby razy 3
Wyświetl na ekranie pierwszych 10 liczb tego strumienia
 */
