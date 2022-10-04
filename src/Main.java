import uaslp.objetos.list.ArrayList.ArrayList;
import uaslp.objetos.list.Iterator;
import uaslp.objetos.list.LinkedList.LinkedList;
import uaslp.objetos.list.List;

public class Main {

    public static void main(String[] args)
    {
        List lista1 = new LinkedList();
        List lista2 = new ArrayList();
        Iterator iterator;

        System.out.println("LinkedList");
        lista1.addAtTail("Miguel");
        lista1.addAtTail("Lopez");
        lista1.addAtTail("Licea");

        lista1.addAtFront("Miguel");
        lista1.addAtFront("Lopez");
        lista1.addAtFront("Licea");

        iterator = lista1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        lista1.remove(0);
        System.out.println("La lista 1 tiene: " +lista1.getSize() + " elementos");

        iterator = lista1.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("ArrayList");

        lista2.addAtTail("Miguel");
        lista2.addAtTail("Lopez");
        lista2.addAtTail("Licea");

        lista2.addAtFront("Miguel");
        lista2.addAtFront("Lopez");
        lista2.addAtFront("Licea");

        iterator = lista2.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        lista2.remove(0);
        System.out.println("La lista 2 tiene: " +lista2.getSize() + " elementos");

        iterator = lista2.getIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
