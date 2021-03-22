import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String args[]){
        Queue<String> q=new LinkedList<String>();
        q.add("Weenie");
        q.add("Panther");
        q.add("Daisy");
        q.add("Oswald");
        q.add("Pongo");
        System.out.println("Elements in queue:"+q);
        System.out.println("Removed elements:" +q.remove());
        System.out.println("Head:" +q.element());
        System.out.println("poll():" +q.poll());
        System.out.println("peek():" +q.peek());
        System.out.println("Elements in queue:"+q);

    }
}
