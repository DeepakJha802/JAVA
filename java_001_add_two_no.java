// import java.util.Scanner;
// public class java_001_add_two_no {

//     public static void main(String[] args) {

//         int num1, num2, sum;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter First Number: ");
//         num1 = sc.nextInt();

//         System.out.println("Enter Second Number: ");
//         num2 = sc.nextInt();

//         sc.close();
//         sum = num1 + num2;
//         System.out.println("Sum of these numbers: "+sum);
//     }
// }
// // Deepak kumar jha


public class java_001_add_two_no{
    public static void main (String[] arg)
    {
        int a , b , c ;
        a = 15 ;
        b = 25 ;
        c = a+b ;
        System.out.println("sum = "+ c);
        System.out.format("sum = %d\n",c); // we can not use format specifier in java with print function .
        System.out.format("%d\n",c); // we can use format spicifier in java with format function.
        //we can not use new line character (i.e, ln ) with format function.
        System.out.println(c); // we can direclty print the value in java without useing any format specifier like python .
    }
}
