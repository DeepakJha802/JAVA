import java.util.Scanner;

public class Tower_Hanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int disk = sc.nextInt();
        tower_Hanoi(disk, source, auxiliary, destination);
    }
    static void tower_Hanoi (int disk , char source , char auxiliary , char destination)
    {
        if (disk <= 1)
        {
            return;
        }
        tower_Hanoi(disk - 1, source, destination, auxiliary);
        System.out.println(source + " " + destination);
        tower_Hanoi(disk - 1, auxiliary, source, destination);
    }
}
