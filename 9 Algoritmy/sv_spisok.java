// Необходимо реализовать метод разворота 
// связного списка (двухсвязного или односвязного на выбор).

public class sv_spisok {

    Node head;
    Node tail;

    public void addFirst(int value) {
        Node node = new Node();
        node.value = value;

        if (head != null) {
            node.next = head;
            head.prev = node;
        } else{
            tail = null;
        }
        head = node;
    }

}
