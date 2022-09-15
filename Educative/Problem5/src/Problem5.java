import java.util.ArrayList;

public class Problem5 {


    // 5. Level Order Traversal of Binary Tree
    // https://www.educative.io/blog/crack-amazon-coding-interview-questions

    private void levelOrderTraversal(Node root) {
        System.out.println(root.name);
        Node[] children = root.children;

        for (Node node : children) {
            System.out.println(node.name);
        }

        for (Node node : ) {
            System.out.println(node.name);
        }
    }

    public static void main(String[] args) {
        Node root = new Node();
        root.name = "100";

        BinaryTree
        ArrayList<Node> lvl1 = new ArrayList<>();
        lvl1.add(new Node("50", root)); lvl1.add(new Node("100", root));
        root.children = (Node[])lvl1.toArray();
        ArrayList<Node> lvl2 = new ArrayList<>();
        lvl2.add(new Node("25", lvl1.get(0))); lvl2.add(new Node("75", lvl1.get(0))); lvl2.add(new Node("350", lvl1.get(1)));

    }
}


