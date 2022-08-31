import java.util.Scanner;

class Student
{
    String Name;
    int rollNumber;
}

public class Student_use2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Student s3 = new Student();
        Student s4 = new Student();

        s3.Name = "Deepak";
        s3.rollNumber = 057;

        System.out.println(s3.Name + " " + s3.rollNumber);
    }
}
