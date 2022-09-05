import java.util.Scanner;

public class Student_use
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number_of_students = sc.nextInt();

        Student s = new Student(number_of_students);

        System.out.println("Enter the students' names and roll numbers :-");
        for (int i = 0; i < number_of_students; ++i)
        {
            sc.nextLine();
            String name = sc.nextLine();
            long roll_number = sc.nextLong();

            s.add_student_details(name, roll_number);
        }

        s.print_all_student_details();
    }
}
