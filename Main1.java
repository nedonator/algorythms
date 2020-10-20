import java.util.Random;

public class Main1 {
    static class Out {
        Node n;
        int depth;

        public Out(Node n, int depth) {
            this.n = n;
            this.depth = depth;
        }
    }

    public static void f(Node n, Out out, int depth) {
        if(n != null) {
            if (depth > out.depth) {
                out.depth = depth;
                out.n = n;
            }
            f(n.left, out, depth + 1);
            f(n.right, out, depth + 1);
        }
    }

    static Random random = new Random();
    public static void randomTree(Node n, int leftBound, int rightBound, double p){
        if(random.nextDouble() < p){
            n.left = new Node(leftBound, n.value);
            randomTree(n.left, leftBound, n.value, p - 1);
        }
        if(random.nextDouble() < p){
            n.right = new Node(n.value, rightBound);
            randomTree(n.right, n.value, rightBound, p - 1);
        }
    }

    public static void main(String[] args) {
        Node tree = new Node(-100500, 100500);
        randomTree(tree, -100500, 100500, 3);
        Out out = new Out(null, -100500);

        f(tree, out, 0);
        System.out.println(out.depth);
        System.out.println(out.n.value);
    }
}
