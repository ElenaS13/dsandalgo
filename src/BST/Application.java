package BST;

public class Application {
    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(10, "Ten");
        tree.insert(20, "Twenty");
        tree.insert(30, "Thirty");
        tree.insert(40, "Forty");
        System.out.println(tree.findMax().key);
    }


}
