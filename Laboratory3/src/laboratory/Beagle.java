package laboratory;

public class Beagle extends Dog{
    public Beagle(String name, double height, int legCount) {
        super(name, height, legCount);
    }

    @Override
    public void displayInfo() {
        System.out.println("name - " + this.name+ ", height - " + this.height + ", " + this.legCount + " legs, breed - beagle");
    }
}
