package computer.sort;

import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            List<Computer> computers = NewFileReader.readFile("computers.data.txt");
            computers.sort(chooseComparator());
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

    static Comparator<Computer> chooseComparator() {
        System.out.println("How do you want to sort?");
        System.out.println("cpu, memory, name?");
        String sortBy = sc.nextLine();
        switch (sortBy) {
            case "cpu": return new CpuComparator();
            case "memory": return new MemoryComparator();
            default: return null;
        }
    }
}
