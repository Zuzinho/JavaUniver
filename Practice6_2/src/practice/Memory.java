package practice;

import java.util.Scanner;

public class Memory implements Inputable{
    private long capacity;
    private long hertz;
    private Scanner sc = new Scanner(System.in);


    public Memory() {
        input();
    }

    public long getCapacity() {
        return capacity;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }

    public long getHertz() {
        return hertz;
    }

    public void setHertz(long hertz) {
        this.hertz = hertz;
    }

    @Override
    public void input() {
        System.out.print("Enter capacity and hertz of memory: ");
        this.capacity = sc.nextLong();
        this.hertz = sc.nextLong();
    }

    @Override
    public String toString() {
        return String.format("Memory:\nCapacity: %1$s\nHertz: %2$s\n",capacity,hertz);
    }
}
