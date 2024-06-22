package arrays.utils;

import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        try {
            int[] numbers = ReadFile.reader("numbers.data.txt");
            Arrays.sort(numbers);
            System.out.println("Najmniejsza liczba: " + numbers[0]);
            System.out.println("Największa liczba: " + numbers[numbers.length - 1]);
            int i = Arrays.binarySearch(numbers, 15);
            System.out.println("Inteks wystąpienia " + i);
            System.out.println(Arrays.toString(numbers));
        } catch (IOException e) {
            System.err.println("File not found");
        }
    }
}
