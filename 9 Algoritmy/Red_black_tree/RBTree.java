
public class RBTree<T extends Comparable<T>> {
    private Node root;

    /*
     * public boolean contains(T value) {
     * Node node = root;
     * while (node != null) {
     * if (node.value.equals(value)) {
     * return true;
     * }
     * if (node.value.compareTo(value) > 0) {
     * node = node.left;
     * } else {
     * node = node.rigth;
     * }
     * }
     * return false;
     * }
     */

    public boolean add(T value) {
        if (root != null) {
            boolean result = addNode(root, value);
            root = rebalance(root);
            root.color = Color.BLACK;
            return result;
        } else {
            root = new Node();
            root.color = Color.BLACK;
            root.value = value;
            return true;
        }
    }

    private boolean addNode(Node node, T value) {
        if (node.value == value) {
            return false;
        } else {
            if (node.value.compareTo(value) > 0) {
                if (node.left != null) {
                    boolean result = addNode(node.left, value);
                    node.left = rebalance(node.left);
                    return result;
                } else {
                    node.left = new Node();
                    node.left.color = Color.RED;
                    node.left.value = value;
                    return true;
                }
            } else {
                if (node.rigth != null) {
                    boolean result = addNode(node.rigth, value);
                    node.rigth = rebalance(node.rigth);
                    return result;
                } else {
                    node.rigth = new Node();
                    node.rigth.color = Color.RED;
                    node.rigth.value = value;
                    return true;
                }
            }
        }
    }

    // балансировка дерева
    private Node rebalance(Node node) {
        Node result = node;
        boolean needRebalance;
        do {
            needRebalance = false;
            if (result.rigth != null && result.rigth.color == Color.RED &&
                    (result.left == null || result.left.color == Color.BLACK)) {
                needRebalance = true;
                result = rightSwap(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                    result.left.left != null && result.left.left.color == Color.RED) {
                needRebalance = true;
                result = leftSwap(result);
            }
            if (result.left != null && result.left.color == Color.RED &&
                    result.rigth != null && result.rigth.color == Color.RED) {
                needRebalance = true;
                colorSwap(result);
            }
        } while (needRebalance);

        return result;
    }

    // правый малый разворот
    private Node rightSwap(Node node) {
        Node rightChild = node.rigth;
        Node betweenChild = rightChild.left;
        rightChild.left = node;
        node.rigth = betweenChild;
        rightChild.color = node.color;
        node.color = Color.RED;
        return rightChild;
    }

    // левый малый разворот
    private Node leftSwap(Node node) {
        Node leftChild = node.left;
        Node betweenChild = leftChild.rigth;
        leftChild.rigth = node;
        node.left = betweenChild;
        leftChild.color = node.color;
        node.color = Color.RED;
        return leftChild;
    }

    // разворот цвета
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
