public class forech {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9,10};
         int sum = 0;

         for(int x: nums){
            System.out.println("value is:"+x);
            sum += x;

         }
         System.out.println("vaue is :" + sum);

    }
}
