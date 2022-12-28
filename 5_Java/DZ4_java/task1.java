import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, 
// который вернет “перевернутый” список.

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedL = new LinkedList<>();
        LinkedList<Integer> reversLinkedL = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
                linkedL.add(i);
        }
        System.out.println(linkedL);
        reversLinkedL = ReverseLinkedList(linkedL);
        System.out.println(reversLinkedL);
        
    }
    public static LinkedList<Integer> ReverseLinkedList(LinkedList<Integer> linList)
    {
        LinkedList<Integer> revLinList = new LinkedList<Integer>();
        for (int i = linList.size() - 1; i >= 0; i--) {
            revLinList.add(linList.get(i));
        }
        return revLinList;
    }
}
