package streams;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.iterate(0, x -> x + 1)
                .filter(x -> x % 13 == 0 & x % 17 == 0 & x % 19 == 0)
                .limit(10)
                .map(x -> x * 3)
                .forEach(x -> System.out.print(x + " - "));
    }
}
