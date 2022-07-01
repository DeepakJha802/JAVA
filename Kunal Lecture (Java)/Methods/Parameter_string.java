
public class Parameter_string {
    public static void main(String[] args) {

        String message = Greet("Deepak Jha");
        System.out.println(message);
    }

    static String Greet(String para)
    {
        String ans = "Welcome " + para;
        return ans;

    }
}


// Acually the value of the reference variable is pass.

// in java there is no particular things known as pass by reference.

// in java there is only pass by value.

// When we pass somethings in the function in java there is no pass by reference it's only pass by value.

// in pass by value create a new object but in case of pass by reference 
