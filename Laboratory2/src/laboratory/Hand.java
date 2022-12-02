package laboratory;

public class Hand {
    private boolean leftSide;
    private int fingerCount = 5;

    public Hand(boolean leftSide) {
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
        return side + " hand has " + fingerCount + " fingers\n";
    }
}
