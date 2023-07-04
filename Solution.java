class Solution {
    public static void main(String args[]) {
        int[] B = {0,2,4,1,3};

            for(int i = 0; i < b.length; i++) {

            b[i] = b[(b[i] + 3) % b.length];
        }
        System.out.println(B[1]);
    }
}

