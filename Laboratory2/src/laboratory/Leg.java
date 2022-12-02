package laboratory;

public class Leg {
    private boolean leftSide;
    private int fingerCount = 5;

    public Leg(boolean leftSide) {
        this.leftSide = leftSide;
    }

    public boolean isLeftSide() {
        return leftSide;
    }

    public int getFingerCount() {
        return fingerCount;
    }

    public void setFingerCount(int fingerCount) {
        this.fingerCount = fingerCount;
    }

    @Override
    public String toString() {
        String side = leftSide? "Left":"Right";
        return side + " leg has " + fingerCount + " fingers\n";
    }
}
