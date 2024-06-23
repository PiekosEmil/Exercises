package computer.sort;

import java.util.Comparator;

public class CpuComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer c1, Computer c2) {
        if (c1.getCpu() < c2.getCpu()) {
            return 1;
        } else if (c1.getCpu() > c2.getCpu()) {
            return -1;
        } else {
            return 0;
        }
    }
}
