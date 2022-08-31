import java.util.Scanner;

public class Student_use
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        // System.out.println(s1);
        s1.Name = "Deepak";
        s1.rollNumber = 057;

        System.out.println(s1.Name + " " + s1.rollNumber);

        s2.Name = "Ankush";
        s2.rollNumber = 151;

        System.out.println(s2.Name + " " + s2.rollNumber);
    }
}
