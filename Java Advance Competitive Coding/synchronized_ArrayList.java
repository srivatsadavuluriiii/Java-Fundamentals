import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class synchronized_ArrayList {
    public static void main(String[] args) {
        //Method 1 : using Collections.synchronizedList
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        synchronized (list) {
            Iterator<String> it = list.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }

        System.out.println("---------------------");

        //Method 2 : using CopyOnWriteArrayList
        CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        Iterator<String> it = list2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}