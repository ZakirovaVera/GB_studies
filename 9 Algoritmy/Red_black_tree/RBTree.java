
public class RBTree<T extends Comparable<T>> {
    private Node root;

    public boolean contains(T value) {
        Node node = root;
        while (node != null) {
            if (node.value.equals(value)) {
                return true;
            }
            if (node.value.compareTo(value) > 0) {
                node = node.left;
            } else {
                node = node.rigth;
            }
        }
        return false;
    }

    public void add(T value) {
        Node node = root;
        Node newNode = new Node();
        newNode.value = value;
        if (root != null) {
            if (node.value.compareTo(value) > 0) {
                node.left = newNode;
            } else {
                node.rigth = newNode;
            }
        } else {
            root = newNode;
        }
    }

    private Node rightSwap(Node node) {

        return rightChild;
    }

    private Node leftSwap(Node node) {

        return leftChild;
    }

    private void colorSwap(Node node) {
        node.rigth.color = Color.BLACK;
        node.left.color = Color.BLACK;
        node.color = Color.RED;
    }

    private class Node {
        private T value;

        private Color color;
        private Node left;
        private Node rigth;
    }

    private enum Color {
        RED, BLACK;
    }
}
