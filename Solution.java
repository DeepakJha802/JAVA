import javax.sound.midi.Synthesizer;

// class Solution
// {
//     static void area(int r)
//     {
//         System.out.println(r * r);
//     }

//     static void area(int x , int y)
//     {
//         System.out.println(x * y);
//     }
//     public static void main(String[] args) {
//         int x = 10;
//         int r = 9;
//         int y = 20;

//         area(r);
//         area(x, y);
//     }
// }


// class A
// {
//     A()
//     {
//         int i = 0;
//         System.out.println("This is first constructor which value of i is: " + i);
//     }
//     A(int x)
//     {
//         System.out.println("This is second Constructor which have value of x is: " + x);
//     }
//     A(int x , int y)
//     {
//         System.out.println("This is second constructor which have value of x and y is: " + x + " " + y);
//     }
// }
// class Solution
// {
//     public static void main(String[] args) {
//         A ob1 = new A();
//         A ob2 = new A(5);
//         A obj3 = new A(10 , 20);
//     }
// }


class A           // Thsi is superclass
{
    int i , j;
    void showij()
    {
        System.out.println("The value of i & j." + i + " " + j);
    }
}
class B extends A             // This is subclass
{
    int k;
    void showk()
    {
        System.out.println("The value of k." + k);
    }
    void sum()
    {
        System.out.println("The sum is i and j and k." + (i + j + k));
    }
}
class Solution
{
    public static void main(String[] args) {
        A onj = new A();
        B obj1 = new B();

        onj.i = 10;
        onj.j = 20;

        onj.showij();

        obj1.k = 90;

        obj1.showk();

        obj1.sum();

    }
}


