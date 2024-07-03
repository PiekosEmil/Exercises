package lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class RandomNumbers {
    static Random random = new Random();

    public static void main(String[] args) {

        List<Integer> numbers = supplier.get();
        printList(numbers, consumer);
        System.out.println();
        System.out.println("przefiltrowana lista");
        filterByPredicate(numbers, i -> i % 13 != 0);
        printList(numbers, consumer);
    }

    private static <T> void filterByPredicate(List<T> list, Predicate<T> predicate) {
        Iterator<T> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (predicate.test(iterator.next())) {
                iterator.remove();
            }
        }
    }

    static Supplier<List<Integer>> supplier = () -> {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(101));
        }
        return list;
    };

    static <T> void printList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    static Consumer<Integer> consumer = i -> System.out.print(i + " ");
}
