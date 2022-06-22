import java.util.Scanner;

public class Method_swap {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            swap(a,b);
    }

    static void swap(int a , int b)
    {
      int temp = a;
      a = b;
      b = temp;
      System.out.println("After Swaping: "+a+" "+b);
    }

}
// Acually the value of the reference variable is pass.

// in java there is no particular things known as pass by reference.

// in java there is only pass by value.

// When we pass somethings in the function in java there is no pass by reference it's only pass by value.

// in primitive data type parameter is pass by value .
// objects and stuff :- passing value of the reference variables.
