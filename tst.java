// import java.net.SocketPermission;

// public class tst{
//     public static void main (String[] arg)
//     {
//         char c = 'D';
//         System.out.println(c);

//         c = 68;
//         System.out.println(c);

//         c = '\104';
//         System.out.println(c);

//         c = '\u0044';
//         System.out.println(c);

//         String s  = "\u0044\u0045\105P\101\113";
//         System.out.println(s);
//         if (53=='5')
//         System.out.println("yes");
//         else
//         System.out.println("no");
//     }

// }

// import java.util.Scanner;

// public class tst {

//     public static void main(String[] args)
//     {
//       Scanner sc = new Scanner(System.in) ;
//       String str = sc.nextLine();
//       String str1 = sc.nextLine();
//       int l = str.length();
//       int l1 = str1.length();
//       System.out.println(l+l1);
//       if((str.compareTo(str1)) > (str1.compareTo(str)))
//       {
//           System.out.println("YES");
//       }
//       else
//       {
//           System.out.println("No");
//       }
//       String string1 = str.substring(0, 1);
//       String remainingLetters = str.substring(1, str.length());
//       String string2 = str1.substring(0, 1);
//       String remainingLetters2 = str1.substring(1, str1.length());

//       // change the first letter to uppercase
//       string1 = string1.toUpperCase();
//       string2 = string2.toUpperCase();


//       // join the two substrings
//       str = string1 + remainingLetters;
//       str1 = string2 + remainingLetters2;

//       System.out.println(""+str+" "+str1+"");

//     }
// }

// import java.util.Scanner;

// public class tst
// {

//     public static void main(String[] args)
//     {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         int start = sc.nextInt();
//         int end  = sc.nextInt();
//             System.out.println(str.substring(start , end));


//     }

// }


// import java.util.Scanner;

// public class tst {

//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int n = sc.nextInt();
//        int l = str.length();
//        System.out.println(str.substring((l-n),(l)));
//        System.out.println(str.substring(0,(n)));
//     }
// }


import java.util.Scanner;

public class tst
{
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int arr[] = new int[n];
       for (int  i = 0; i<n; i++)
       {
           arr[i]= sc.nextInt();
       }
       for (int i = 0; i<n ; i++)
       {
           System.out.println(arr[i]);
       }
    }
}
