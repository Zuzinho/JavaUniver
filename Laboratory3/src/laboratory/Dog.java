package laboratory;

public abstract class Dog {
    protected String name;
    protected double height;
    protected int legCount;

    public Dog(String name, double height, int legCount) {
        this.name = name;
        this.height = height;
        this.legCount = legCount;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public abstract void displayInfo();
}
