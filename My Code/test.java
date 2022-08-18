import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Human h = new Human();
        h.eat();
        h.sound();

        Dog d = new Dog();
        d.eat();
        d.sound();
    }

}
interface Animal {
   void eat();
   void sound();
}
class Human implements Animal {
    public void eat()
    {
        System.out.println("Any type of food.");
    }
    public void sound()
    {
        System.out.println("Any language");
    }
}
class Dog implements Animal {
    public void eat()
    {
        System.out.println("Both non - veg and veg.");
    }
    public void sound()
    {
        System.out.println("Bark");
    }
}

import java.util.Scanner;
public class test
{
public static void main(String[] args)

    {

        Scanner sc = new Scanner(System.in);

        int n, i, j;

        String t;

        System.out.print("Enter size of the array: ");

        n = sc.nextInt();

        String s[] = new String[n];
        System.out.println("Enter " + n + " elements into the array :-");

        for (i = 0; i < n; i++)

           {
             s[i] = sc.next();
           }

        System.out.print("\nUnsorted array: ");

        for (i = 0; i < n; i++)

           {
             System.out.print(s[i] + " ");
           }

        for (i = 0; i < n; i++)

        {

            for (j = i + 1; j < n; j++)

            {

                if (s[i].compareTo(s[j]) > 0)

                {

                    t = s[i];

                    s[i] = s[j];

                    s[j] = t;
                }
            }
        }
        System.out.println("\nSorted Array: ");
        for (i = 0; i < n; i++)
        {
            System.out.print(s[i] + " ");
        }
    }
}
