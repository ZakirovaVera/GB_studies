import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedL = new LinkedList<>();
        for (int i = 0; i < 6; i++) {
                linkedL.add(i);
        }
        System.out.println(linkedL);
        
        int elementLinList = 6;
        EnqueueLinkedList(linkedL, elementLinList);
        DequeueLinkedList(linkedL);
        FirstLinkedList(linkedL);
        
    }
    public static void EnqueueLinkedList(LinkedList<Integer> lList, int item)
    {
        lList.add(item);
        System.out.printf("EnqueueLinkedList: ");
        System.out.println(lList);
    }
    public static void DequeueLinkedList(LinkedList<Integer> lList)
    {
        int item = lList.removeFirst();
        System.out.printf("DequeueLinkedList: ");
        System.out.println(lList);
        System.out.printf("Первый элемент = %d удален", item);
        System.out.println();
    }
    public static void FirstLinkedList(LinkedList<Integer> lList)
    {
        int item = lList.getFirst();
        System.out.printf("FirstLinkedList: ");
        System.out.println(lList);
        System.out.printf("Первый элемент = %d", item);
        System.out.println();
    }
}
