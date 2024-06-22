package arrays.utils.second;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> strings = Utils.read("strings.data.txt");
            System.out.println("Non sorted list: " + strings);
            Collections.sort(strings);
            System.out.println("Sorted list: " + strings);
            Collections.reverse(strings);
            System.out.println("List reversed: " + strings);
            Map<String, Integer> uniqueMap = Utils.uniqueCounter(strings);
            Utils.maxFrequency(uniqueMap);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }
}
