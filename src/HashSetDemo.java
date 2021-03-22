import java.util.HashMap;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String args[]){
        HashSet<String> hs=new HashSet<String>();
        hs.add("Apple");hs.add("Mango");hs.add("Apple");
        hs.add("Grapes");hs.add("Apple");hs.add("Orange");
        hs.add(null);hs.remove("Grapes");
        System.out.println("HashSet elements are:" +hs);
        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"Apple");
        hm.put(2,"Apple");
        hm.put(3,"Mango");
        System.out.println("HashMap elements are:" +hm);
    }
}
