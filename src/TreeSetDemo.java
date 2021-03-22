import java.util.TreeMap;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String args[]){
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(14);
        ts.add(0);
        ts.add(214);
        ts.add(154);
        System.out.println("TreeSet elements are:" +ts);

        TreeMap<Integer,String> tm=new TreeMap<Integer, String>();
        tm.put(2,"Tom");
        tm.put(4,"Jerry");
        tm.put(0,"Phines");
        tm.put(1,"Ferb");
        System.out.println("TreeMap elements are:" +tm);
    }
}
