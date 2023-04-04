// Необходимо реализовать метод разворота 
// связного списка (двухсвязного или односвязного на выбор).

public class sv_spisok {

    Node head;
    Node tail;

    public static void printList(sv_spisok spisok) {
        Node node = spisok.head;
        while (node != null && node.next != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        if (node != null)
            System.out.println(node.value);
    }

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;

        if (head != null) {
            node.next = head;
            head.prev = node;
            if (tail == null) {
                tail = head;
            }
        } else {
            tail = null;
        }

        head = node;
    }

    public void revertStartHead() {
        Node nextHead = tail;
        Node nextTail = head;

        // True - начали с головы.
        head.Recursive(true);

        head = nextHead;
        tail = nextTail;
    }

    public void revertStartTail() {
        Node nextHead = tail;
        Node nextTail = head;

        // True - начали с головы.
        tail.Recursive(false);

        head = nextHead;
        tail = nextTail;
    }
}
