public class Student
{
    private static class Student_Details
    {
        String name;
        long roll_number;
    }

    private Student_Details[] array_of_student_details;
    private int i;

    public Student(int number_of_students)
    {
        array_of_student_details = new Student_Details[number_of_students];

        for (int i = 0; i < number_of_students; ++i)
        {
            array_of_student_details[i] = new Student_Details();
        }

        i = 0;
    }

    public void add_student_details(String n, long r)
    {
        array_of_student_details[i].name = n;
        array_of_student_details[i].roll_number = r;
        ++i;
    }

    public void print_all_student_details()
    {
        for (int j = 0; j < i; ++j)
            System.out.println(array_of_student_details[j].name + " " + array_of_student_details[j].roll_number);
    }

    public boolean is_empty()
    {
        return i == 0;
    }

    public boolean is_full()
    {
        return i == array_of_student_details.length;
    }
}
