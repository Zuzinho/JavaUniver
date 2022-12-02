package laboratory;

public class Head {
    private int eyesCount;
    private int earsCount;
    private boolean hasNose;

    public Head(int eyesCount, int earsCount, boolean hasNose) {
        this.eyesCount = eyesCount;
        this.earsCount = earsCount;
        this.hasNose = hasNose;
    }

    public int getEyesCount() {
        return eyesCount;
    }

    public void setEyesCount(int eyesCount) {
        this.eyesCount = eyesCount;
    }

    public int getEarsCount() {
        return earsCount;
    }

    public void setEarsCount(int earsCount) {
        this.earsCount = earsCount;
    }

    public boolean isHasNose() {
        return hasNose;
    }

    public void setHasNose(boolean hasNose) {
        this.hasNose = hasNose;
    }

    @Override
    public String toString() {
        String nose = hasNose? "has":"doesn`t have";
        return "Head " + nose + " nose, has " + eyesCount + " eyes, " + earsCount + " ears\n";
    }
}
