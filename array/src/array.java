import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class array {


//        public static void secodmax(Integer arr[],int n){
//            int s;
//
//           // Array Arrays;
//           // Arrays.sort(arr, Collection.reverseOrder());
//            Arrays.sort(arr, Collection.rever());
//
//            for (int i = 0; i <n; i++) {
//                if (arr[i]!=arr[0]) {
//                    // third = s;
//                    // s =   arr[i];
//                    System.out.println(arr[i]);
//                    return;
//                }
//            }
//
//        }
//
//        public static void main(String[] args) {
//            Integer arr[]={12,35,1,10,34,1};
//            int n =arr.length;
//            secodmax(arr, n);
//        }

    static void print2largest(Integer arr[], int arr_size)
    {
        // Sort the array in descending order
      //  Arrays.sort(arr, Collection.reverseOrder());
        // Start from second element as first
        // element is the largest
        for (int i = 1; i < arr_size; i++) {
            // If the element is not
            // equal to largest element
            if (arr[i] != arr[0]) {
                System.out.printf("The second largest "
                                + "element is %d\n",
                        arr[i]);
                return;
            }
        }

        System.out.printf("There is no second "
                + "largest element\n");
    }

    // Driver code
    public static void main(String[] args)
    {
        Integer arr[] = { 12, 35, 1, 10, 34, 1 };
        int n = arr.length;
        print2largest(arr, n);
    }
}





