package practice;

public class TestDrunkGame {
    public static void main(String[] args) {
        DrunkGameStack dgs = new DrunkGameStack();
        dgs.fillPlayers();
        dgs.play();
        DrunkGameQueue dgq = new DrunkGameQueue();
        dgq.fillPlayers();
        dgq.play();
        DrunkGameDeque dgd = new DrunkGameDeque();
        dgd.fillPlayers();
        dgd.play();
        DrunkGameLinkedList dgll = new DrunkGameLinkedList();
        dgll.fillPlayers();
        dgll.play();
    }
}
