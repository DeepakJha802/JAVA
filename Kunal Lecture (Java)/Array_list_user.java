import java.util.ArrayList;
import java.util.Scanner;

public class Array_list_user {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }

        // Get elements at any index.
        for(int i = 0; i < n; i++)
        {
            System.out.println(list.get(i));  // list[i]  will give error.
        }

        // System.out.println(list);
    }

}

// In array list not every single element can be a primitive because it does not allowed it. why? that is we will learn in OOPs.

// The Size of ArrayList is fixed internally.
// When our ArrayList is fills to a some Particular amount . Let's Say 50 % Then ,
// it will create a new ArrayList of let's say double the size and the list will be empty.
// Old elements are copied in new one.
// Old one is deleted.
