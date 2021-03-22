import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

    public static void main(String args[]){
        Enumeration names;
        int numbers = 0;
        Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
        ht.put(2,"Oswald");
        ht.put(1,"Pongo");
        ht.put(3,"Daisy");
        ht.put(5,"Weenie");
        ht.put(4,"Panther");
        names=ht.keys();
        for(Map.Entry<Integer,String> e:ht.entrySet())
        System.out.println(e.getKey() + " : " + e.getValue());
    }
}
