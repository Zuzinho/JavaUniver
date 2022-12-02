package practice;

import java.util.Scanner;

public class Computer {
    private Processor processor;
    private Memory memory;
    private Monitor monitor;
    private Company company;

    public Computer() {
        this.processor = new Processor();
        this.memory = new Memory();
        this.monitor = new Monitor();
        System.out.print("Enter computer`s company: ");
        Scanner sc = new Scanner(System.in);
        this.company = Company.valueOf(sc.next());
    }

    @Override
    public String toString() {
        return company.toString() + processor + memory + monitor;
    }
}
