
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class arrayList_iteration {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>();
        test.add(10);
        test.add(45);
        test.add(234);
        test.add(21);
        Iterator<Integer> it =  test.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------------");

        System.out.println(test.indexOf(21)>(test.size() - 1));

        System.out.println("---------------------");

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C","D"));
        System.out.println(list);

        System.out.println("---------------------");

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(10,20,30,40));
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>(list2.subList(2,3));
        System.out.println(list3);
    }
}
