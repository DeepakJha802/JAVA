import java.util.Scanner;

public class Pattern_Print {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Pattern(n);
    }

    // static void Pattern (int n)
    // {
    //     for (int i = 1; i <= n; i++)
    //     {
    //         for (int j = 1; j <= i; j++)   //  for (int j = i; j >= 1; j--) (we can write this type also).
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }

    //     /*
    //         *
    //         * *
    //         * * *
    //         * * * *
    //     */
    // }

/////////////////////////////////////////////////////////////////////

    // static void Pattern (int n)
    // {
    //     for (int i = 1; i <= n; i++)
    //     {
    //         for (int j = 1; j <=n; j++)
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // /*
    //     * * * *
    //     * * * *
    //     * * * *
    //     * * * *
    // */

    /////////////////////////////////////////////////////////////

    // static void Pattern (int n)
    // {
    //     for (int i = 0; i < n; i++)
    //     {
    //        for (int j = n - i; j >= 1; j--)    //  for (int j = 1; j <= n - i; j++)
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // /*
    //     * * * *
    //     * * *
    //     * *
    //     *
    // */

    ////////////////////////////////////////////////////////////

    // static void Pattern (int n)
    // {
    //     for (int i = 1; i <= n; i++)
    //     {
    //         for (int j = 1; j <= i; j++)
    //         {
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    // /*
    //     1
    //     1 2
    //     1 2 3
    //     1 2 3 4
    // */

    ////////////////////////////////////////////////////////////////

    // static void Pattern (int n)
    // {
        // for (int i = 1; i <= n; i++)
        // {
        //     for (int j = i; j >= 1; j--)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i <= (n - 1); i++)
        // {
        //     for (int j = n - i; j >= 1; j--)
        //     {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

    //    (Or)

    //    for (int i = 0; i < 2 * n; i++)
    //    {
    //        int total_col_row = i > n ? 2 * n - i: i;
    //        for (int j = 0; j < total_col_row; j++)
    //        {
    //         System.out.print("* ");
    //        }
    //        System.out.println();
    //    }

    // }


    /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
    */

    ///////////////////////////////////////////////////////////////////////

    // static void Pattern (int n)
    // {
    //     for (int i = 0; i < 2 * n; i++)
    //     {
    //         int total_col_row = i > n ? 2 * n - i: i;
    //         int no_spaces = n - total_col_row;
    //         for (int j = 0; j < no_spaces; j++)
    //         {
    //             System.out.print(" ");
    //         }

    //         for (int k = 0; k < total_col_row; k++)
    //         {
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    /*
                   *
                  * *
                 * * *
                * * * *
               * * * * *
                * * * *
                 * * *
                  * *
                   *
    */

    /////////////////////////////////////////////////////////////////////////////////

    // static void Pattern (int n)
    // {
    //     for (int i = 1; i <= n; i++)
    //     {
    //         for (int k = 0; k < n - i; k++)
    //         {
    //             System.out.print("  ");
    //         }
    //         for (int j = i; j >= 1; j--)
    //         {
    //             System.out.print(j + " ");
    //         }
    //         for (int j = 2; j <= i; j++)
    //         {
    //             System.out.print(j + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    /*
                    1
                2   1   2
            3   2   1   2   3
        4   3   2   1   2   3   4
    5   4   3   2   1   2   3   4   5
    */

    //////////////////////////////////////////////////////////////////////////////////

//     static void Pattern (int n)
//    {
//         for (int i = 1; i <= 2 * n; i++)
//         {
//             int col = i > n ? 2 * n - i: i;

//             for (int j = 0; j < n - col; j++)
//             {
//                 System.out.print("  ");
//             }
//             for (int k = col; k >= 1; k--)
//             {
//                 System.out.print(k + " ");
//             }
//             for (int l = 2; l <= col; l++)
//             {
//                 System.out.print(l + " ");
//             }
//             System.out.println();
//         }
//     }

    ////////////////////////////////////////////////////////////////////////////////////

    // static void Pattern (int n)
    // {
    //     for (int i = 0; i <= 2 * n; i++)
    //     {
    //         for (int j = 0; j <= 2 * n; j++)
    //         {
    //             int every_index = Math.min(Math.min(i, j), Math.min((2 * n - i) , (2 * n - j)));
    //             System.out.print(every_index + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    //////////////////////////////////////////////////////////////////////////////////////////

    // static void Pattern (int n)
    // {
    //     for (int i = 0; i <= 2 * n; i++)
    //     {
    //         for (int j = 0; j <= 2 * n; j++)
    //         {
    //             int every_index = n - Math.min(Math.min(i, j), Math.min((2 * n - i) , (2 * n - j)));
    //             System.out.print(every_index + " ");
    //         }
    //         System.out.println();
    //     }
    // }

    ////////////////////////////////////////////////////////////////////////////////////////////////
}
