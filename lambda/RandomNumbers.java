package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumbers {
    static Random random = new Random();

    public static void main(String[] args) {
        Supplier<List<Integer>> supplier = () -> {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 20; i++) {
                list.add(random.nextInt(101));
            }
            return list;
        };

        Consumer<Integer> consumer = i -> {
            System.out.print(i + " ");
        };

        Predicate<Integer> predicate = i -> i % 2 == 0;

        List<Integer> numbers = supplier.get();
        for (Integer number : numbers) {
            consumer.accept(number);
        }
        System.out.println();
        System.out.println("przefiltrowana lista");
        List<Integer> filteredList = filterByPredicate(numbers, predicate);
        for (Integer i : filteredList) {
            consumer.accept(i);
        }
    }

    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
