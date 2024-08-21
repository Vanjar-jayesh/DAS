package array01;

/**
 * array02
 */
public class array02 {

    public static void findthezeor(int arr[],int size){
        int zerocout=0;
        int onecount = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] ==0) {
                zerocout++;
            }

            if (arr[i]==1) {
                onecount++;
            }
        }
        System.out.println("zerocount:"+zerocout);
        System.out.println("onecount:"+onecount);
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,1,0,0,1,0};
        int n = arr.length;
        findthezeor(arr, n);
    }
}