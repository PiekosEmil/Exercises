package arrays.utils;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    public static int[] reader(String fileName) throws IOException {
        Scanner sc = new Scanner(new File(fileName));
        int[] numbers = new int[30];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        return numbers;
    }
}
