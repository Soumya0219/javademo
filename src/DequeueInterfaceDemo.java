import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueInterfaceDemo {
    public static void main(String args[]){
        Deque<String> dq=new ArrayDeque<String>();
        dq.add("Weenie");
        dq.add("Panther");
        dq.add("Daisy");
        dq.add("Oswald");
        dq.add("Pongo");
        System.out.println("Elements in queue:"+dq);
        System.out.println("Removed elements:" +dq.removeLast());
        System.out.println("Head:" +dq.element());
        System.out.println("poll():" +dq.pollLast());
        System.out.println("peek():" +dq.peek());
        System.out.println("Elements in queue:"+dq);

    }
}
