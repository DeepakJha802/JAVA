import java.util.ArrayList;

public class Array_list {
    public static void main(String[] args) {

        // ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list = new ArrayList<>(5);       // Initial Capacity of array is 5.
        // We can also write this way . Declareing the data type at the time of dynamic memory allocation is not mendatory.
        // ArrayList is the class. Here we can not pass primitive we have to pass the wrapper class.
        {
            list.add(10);
            list.add(15);
            list.add(20);
            list.add(25);
            list.add(30);

            list.add(40);
            list.add(50);
            list.add(60);
            list.add(70);
            list.add(80);

            System.out.println(list);

            list.contains(15);
            list.contains(69);

            list.set(6, 95);

            list.remove(4);
            list.remove(1);
            list.set(2, 85);

            System.out.println(list);


        }
    }
}
