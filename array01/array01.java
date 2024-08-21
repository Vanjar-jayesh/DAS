package array01;

/**
 * array01
 */
public class array01 {

    public static void max(int arr[],int size){
      int i ,f,s,third;

      if (size <3) {
        System.out.println("invalid input");
        return;
      }
      third = f =s = Integer.MIN_VALUE;
      for(i =0; i< size;i++){
        if (arr[i]>f) {
            third = s;
            s = f;
            f= arr[i];
        }

        else if (arr[i]>s) {
            third  =s ;
            s=arr[i];
        }
        else if (arr[i]>third) {
            third = arr[i];
        }
      }
      System.out.println(f);
      System.out.println(s);
      System.out.println(third);

    }

    public static void main(String[] args) {
        int arr[] ={10,4,3,50,23,90};
        int n = arr.length;
        max(arr, n);

    //    for (int i = 0; i < arr.length; i++) {

    //             if (arr[i]<=10) {
    //                 System.out.println(arr[i]);
    //             }
    //             else{
    //                 System.out.println(arr[i]);
    //             }
            
    //     }
    }
}
