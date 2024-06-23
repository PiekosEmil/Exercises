package computer.sort;

public class Computer implements Comparable<Computer> {
    private String name;
    private int cpu;
    private int memory;

    public Computer(String name, int cpu, int memory) {
        this.name = name;
        this.cpu = cpu;
        this.memory = memory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return name + " - cpu:" + cpu +
                ", memory:" + memory;
    }

    @Override
    public int compareTo(Computer o) {
        return this.name.compareTo(o.name);
    }
}
