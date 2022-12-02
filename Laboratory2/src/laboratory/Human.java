package laboratory;

public class Human {
    private Head head;
    private Hand leftHand;
    private Hand rightHand;
    private Leg leftLeg;
    private Leg rightLeg;

    public Human(){
        head = new Head(2,2,true);
        leftHand = new Hand(true);
        rightHand = new Hand(false);
        leftLeg = new Leg(true);
        rightLeg = new Leg(false);
    }

    public Head getHead() {
        return head;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    @Override
    public String toString() {
        return head.toString() + leftHand + rightHand + leftLeg + rightLeg;
    }
}
