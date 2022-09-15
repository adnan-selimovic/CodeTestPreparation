public class Node {
    public String name;
    public Node parent;
    public Node[] children;

    public Node() { } // default constructor

    public Node(String name, Node parent) {
        this.name = name;
        this.parent = parent;
    }
}
