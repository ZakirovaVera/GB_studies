
public class main {
    public static void main(String[] args) {
        sv_spisok s = new sv_spisok();
        generateSpisok(10, s);

        sv_spisok.printList(s);

        s.revertStartHead();
        sv_spisok.printList(s);

        s.revertStartTail();
        sv_spisok.printList(s);
    }

    public static void generateSpisok(int count, sv_spisok s){
        for (int i = 0; i < count; i++) {
            s.addFirst(i);
        }
    }
}