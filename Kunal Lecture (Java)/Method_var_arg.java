public class Method_var_arg {
    public static void main(String[] args)
    {
        fun(1,2,3,45,6,5,23,65,3,156,59,556,565,32,65,5);
        // this is print all of this and it is internally store it is an array.

        multiple(25,24,"Deepak" , "Kumar" , "Jha");
    }

    static void fun(int ...v) // this is internally it's takeing as an array of integers. (Depends on data type or character or string).
    // This is known as variable length arguments.
    {
        System.out.println(Arrays.toString(v));
    }

    // Mixed length arguments.

    static void multiple(int a ,int b, String ...n)
    {

    }

}
