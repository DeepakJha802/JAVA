import java.util.Scanner;

public class List_swap {

    public static void main(String[] args) {

        Scanner sc = Scanner(System.in);

        int[] arr= {1 , 3 , 5 , 15 , 45 ,65}

        swap(arr,1,3);

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] , int index1 , index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
