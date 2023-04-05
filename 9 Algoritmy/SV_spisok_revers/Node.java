public class Node {
    int value;
    Node next;
    Node prev;

    public void Recursive(boolean isStartHead) {
        if (next == null && prev == null) {
            return;
        }

        Node newNext = prev;
        prev = next;
        next = newNext;

        // Если начали с головы.
        if (prev != null && isStartHead) {
            prev.Recursive(isStartHead);
        }

        // Если начали с хвоста.
        if (next != null && isStartHead == false) {
            next.Recursive(isStartHead);
        }
    }
}
