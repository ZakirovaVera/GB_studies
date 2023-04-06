/*Необходимо превратить собранное на семинаре дерево поиска в полноценное левостороннее 
красно-черное дерево. И реализовать в нем метод добавления новых элементов с балансировкой.

Красно-черное дерево имеет следующие критерии:
• Каждая нода имеет цвет (красный или черный)
• Корень дерева всегда черный
• Новая нода всегда красная
• Красные ноды могут быть только левым ребенком
• У краной ноды все дети черного цвета

Соответственно, чтобы данные условия выполнялись, после добавления элемента в дерево необходимо 
произвести балансировку, благодаря которой все критерии выше станут валидными. Для балансировки 
существует 3 операции – левый малый поворот, правый малый поворот и смена цвета.*/

public class Main {
    public static void main(String[] args) {
        RBTree<Integer> tree = new RBTree<>();
        tree.add(40);
        tree.add(4);
        tree.add(23);
        tree.add(0);
        tree.add(7);
        tree.add(14);
        tree.add(100);
        tree.add(7);
        tree.add(46);
        tree.add(24);

        tree.printTree();
    }
}