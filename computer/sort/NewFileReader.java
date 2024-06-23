package computer.sort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NewFileReader {
    static List<Computer> readFile(String fileName) throws FileNotFoundException {
        List<Computer> computers = new ArrayList<>();
        Scanner sc = new Scanner(new File(fileName)).useDelimiter(";");
        while (sc.hasNext()) {
            String name = sc.next();
            int cpu = Integer.valueOf(sc.next());
            sc.skip(";");
            int memory = Integer.valueOf(sc.nextLine());
            computers.add(new Computer(name, cpu, memory));
        }
        return computers;
    }
}
