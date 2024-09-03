package array01;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arra08 {

    static void assing(int arr[] , int n){
        Arrays.sort(arr);

        int ans[] = new int [n];

        int prt1 = 0 , ptr2 = n -1;

        for(int i = 0; i<n; i++){
            if (i %2==1) {
                ans[i] = arr[ptr2--];
            }
            else{
                ans[i] =arr[prt1++];
            }
        }
        for(int i = 0; i <n; i++){
            System.out.println( ans[i]+ " ");
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,2,1};

        int n = arr.length;
        assing(arr, n);
    }
}
