package computer.sort;

import java.util.Comparator;

public class MemoryComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        if (c1.getMemory() < c2.getMemory()) {
            return 1;
        } else if (c1.getMemory() > c2.getMemory()) {
            return -1;
        } else {
            return 0;
        }
    }
}
