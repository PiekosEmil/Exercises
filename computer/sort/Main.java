package computer.sort;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        try {
            List<Computer> computers = NewFileReader.readFile("computers.data.txt");
            Collections.sort(computers);
            printList(computers);
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
    }

    static void printList(List<Computer> list) {
        for (Computer computer : list) {
            System.out.println(computer);
        }
    }
}
