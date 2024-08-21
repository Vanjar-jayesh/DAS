package array01;
//rev number ;
import java.util.*;
public class array03 {
    public static void rev(int aee[],int n ){
        int l =0;
        int r = 0;

        while (l<=r) {
        //  Collection.swap(aee[r],aee[l]);
            l++;
            r++;
        }
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int n = arr.length;

        rev(arr, n);

    }
}
