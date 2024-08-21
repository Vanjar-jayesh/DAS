package array01;
import java.util.Arrays;

/**
 * array06
 */
public class array06 {

    public static void main(String[] args) {
        //int arr[]={2,1,3,4};
        int arr[]={0,1,2,0,1,2};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}