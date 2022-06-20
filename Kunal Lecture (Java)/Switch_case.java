import java.util.Scanner;

public class Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // switch (n)
        // This Switch implementation is slightly poor style.................try some modern style!!
        // {
            // case 1:
            // System.out.println("Monday");
            // break;

            // case 2:
            // System.out.println("Tuesday");
            // break;

            // case 3:
            // System.out.println("Wednesday");
            // break;

            // case 4:
            // System.out.println("Thrusday");
            // break;

            // case 5:
            // System.out.println("Friday");
            // break;

            // case 6:
            // System.out.println("Saturday");
            // break;

            // case 7:
            // System.out.println("Sunday");
            // break;

            // default :
            // System.out.println("Enter Valid Day !!");

        // }

        // switch(n)
        // // This implementation of switch statement is modern type.
        // {
        //     // case 1 -> System.out.println("Monday");      // Here no need to write break.
        //     // case 2 -> System.out.println("Tuesday");     // This is modern way to write switch statement.
        //     // case 3 -> System.out.println("Wednesday");
        //     // case 4 -> System.out.println("Thrusday");
        //     // case 5 -> System.out.println("Friday");
        //     // case 6 -> System.out.println("Saturday");
        //     // case 7 -> System.out.println("Sunday");
        // }

        // switch (n)
        // {
        //     case 1,2,3,4,5 -> System.out.println("Weekday");
        //     case 6,7 -> System.out.println("Weeknd");
        // }

        switch (n)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Weekday");
            break;

            case 6:
            case 7:
            System.out.println("Weeknd");
            break;

            default :
            System.out.println("Input Valid Day !!");
        }
    }
}
