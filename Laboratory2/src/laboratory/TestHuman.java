package laboratory;

public class TestHuman {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println(human);
        human.getLeftHand().setFingerCount(3);
        human.getHead().setHasNose(false);
        human.getRightLeg().setFingerCount(7);
        System.out.println(human);
    }
}
