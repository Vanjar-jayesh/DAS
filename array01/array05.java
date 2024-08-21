package array01;

/**
 * array05
 */
public class array05 {
    public static int findindexs(int arr[],int t){
        if (arr ==null) {
            return -1;
        }

        int len= arr.length;
        int i =0;

        while (i<len) {
            if (arr[i] == t) {
                return i;
                
            }
            else i = i+1;
            
        }
        return -1;
    }
public static void main(String[] args) {
    
    int arr[]={1,3,5,6};
    int target = 7;

    // for (int i = 0; i < arr.length; i++) {
           
    //     if (target == arr[i]) {

    //         int indeof = ArrayUtils.indeof(arr[i],target)
            
    //     }
    // }
    System.out.println(findindexs(arr, target));
}
    
}