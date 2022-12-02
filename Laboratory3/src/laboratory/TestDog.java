package laboratory;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Sheepdog("Wolf",1.2,4);
        dog.displayInfo();
        Beagle beagle = new Beagle("Kobe",0.42,4);
        beagle.displayInfo();
    }
}
