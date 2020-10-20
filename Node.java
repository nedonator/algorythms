import java.util.Random;

public class Node {
    Node right;
    Node left;
    int value;

    public Node(int leftBound, int rightBound) {
        value = new Random().nextInt(rightBound - leftBound) + leftBound;
    }
}
