package practice;

import java.util.Scanner;

public enum Company {
    Apple,
    Lenovo,
    Acer,
    ASUS,
    HP,
    DELL;

    @Override
    public String toString() {
        return String.format("Computer`s company: %1$s\n",super.toString());
    }
}
