import java.util.Scanner ;
public class cheack {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
       int a = s.nextInt();
        double d = s.nextDouble();
        // s.nextLine();
        String str = s.next();
        char ch = str.charAt(0);
        System.out.println("String: " +str);
        System.out.println("Double: " +d);
        System.out.println("Int: " +a);
    }

}
