package array01;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class arrray04 {

    public static void secodmax(int arr[],int n){
        int s,third;

        if (n<2) {
            System.out.println("invalid input");
        }
        // Arrays.setShort(arr, Collection.reverseOrder());
        Arrays.sort(arr);

        System.out.println(arr[n -2]);


        // for (int i = 0; i <n; i++) {
        //     if (arr[i]!=arr[0]) {
        //         // third = s;
        //        // s =   arr[i]; 
        //        System.out.println(arr[i]);
        //        return;    
        //     }
        // }

    }

    public static void main(String[] args) {
        int arr[]={12,35,1,10,34,1};
        int n =arr.length;
        secodmax(arr, n);
    }
    
}
