import java.util.Vector;

public class VectorDemo {
    public static void main(String args[]){
        Vector<Integer> v=new Vector<Integer>(2,3);
        v.add(2);
        v.add(4);
        v.add(6);
        System.out.println("The elements are:" +v.capacity());
        v.add(3);
        v.add(5);
        System.out.println("The elements after adding:" +v.capacity());
    }
}
