package method.references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jan", "Maria", "stefan", "Kamil", "Zenon", "daniel", "Emil", "Franciszek");
        names.sort(String::compareToIgnoreCase);
        System.out.println(names);
    }
}
