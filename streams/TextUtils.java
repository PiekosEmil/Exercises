package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class TextUtils {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("lorem.txt"));
        Scanner scanner = new Scanner(bufferedReader).useDelimiter(" ");
        List<String> words = new ArrayList<>();
        while (scanner.hasNext()) {
            words.add(scanner.next());
        }
        List<String> words1 = words.stream().map(s -> removeDelimiters(s)).toList();
        words1.forEach(System.out::print);

        List<String> words2 = words1.stream().filter(s -> startsWithS(s)).toList();
        words2.forEach(System.out::print);

        long count = words2.stream().filter(s -> contains5Characters(s)).count();
        System.out.println(count);
    }

    private static String removeDelimiters(String word) {
        if (word.contains(",")) {
            return word.replace(",", "");
        }
        if (word.contains(".")) {
            return word.replace(".", "");
        }
        return word;
    }

    private static boolean startsWithS(String word) {
        return word.startsWith("s");
    }

    private static boolean contains5Characters(String word) {
        if (word.length() == 5) {
            return true;
        }
        return false;
    }
}
