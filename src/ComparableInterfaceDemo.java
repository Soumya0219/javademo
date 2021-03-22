import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceDemo {
    public static void main(String args[]){
        int[] arr = {11,55,22,0};
        Arrays.sort(arr);
        System.out.print("Sorted Int Array: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Sorted String Array: ");
        String[] names = {"Joe", "adam", "Eva"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.print("Sorted List: ");
        List fruits = new ArrayList();
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Apple");
        Collections.sort(fruits);
        for(Object s: fruits)
            System.out.print(s+", ");
    }
}
