package practice;

import java.util.Scanner;

public class Processor implements Inputable{
    private long hertz;
    private int coresCount;
    private long cashBytesCount;

    private Scanner sc = new Scanner(System.in);

    public Processor() {
        input();
    }

    public long getHertz() {
        return hertz;
    }

    public void setHertz(long hertz) {
        this.hertz = hertz;
    }

    public int getCoresCount() {
        return coresCount;
    }

    public void setCoresCount(int coresCount) {
        this.coresCount = coresCount;
    }

    public long getCashBytesCount() {
        return cashBytesCount;
    }

    public void setCashBytesCount(long cashBytesCount) {
        this.cashBytesCount = cashBytesCount;
    }

    @Override
    public void input() {
        System.out.print("Enter hertz, count of cores and cash capacity: ");
        this.hertz = sc.nextLong();
        this.coresCount = sc.nextInt();
        this.cashBytesCount = sc.nextLong();
    }

    @Override
    public String toString() {
        return String.format("Processor:\nHertz count: %1$s\nCores count: %2$s\nCash capacity: %3$s\n",hertz,coresCount,cashBytesCount);
    }
}
