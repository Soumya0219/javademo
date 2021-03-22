import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String args[]) {
        ArrayList al = new ArrayList();
        al.add("Eva");
        al.add("Joe");
        al.add("Adam");
        Iterator it = al.iterator();
        for (Object s : al)
            System.out.println(s);
        ListIterator<String> litr = null;
        List<String> names = new ArrayList<String>();
        names.add("Eva");
        names.add("Joe");
        names.add("Adam");
        litr = names.listIterator();
        System.out.println("Traversing the list in forward direction:");
        while (litr.hasNext())
            System.out.println(litr.next());

        System.out.println("\nTraversing the list in backward direction:");
        while (litr.hasPrevious())
            System.out.println(litr.previous());
    }

}
