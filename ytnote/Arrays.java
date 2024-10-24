public class Arrays {
    public static void main(String[] args) {
        //String cars[] = {"volvo","BMW","ford","mazda"};

       // System.out.println(cars[3]);


        // one dimensidonal Arrays

       /*  double nums[] = {
            10.1,11.2,12.3,13.4,14.5
        };
        double result =0;
        int i;

        for (i=0; i<nums.length; i++) {
            result = result+nums[i];
        }
        System.out.println("Average is "+result/nums.length);
        */


        // two dimensidonal Arrays;

        // int twod [] [] = new int[4][5];

        // int i,j,k=0;

        // for(i=0; i<4; i++){
        //     for(j=0;j<5; j++)
        //     {
        //         twod[i][j] = k;
        //         k++;

        //     }
        // }

        // for(i=0; i<4; i++){
        //     for(j=0; j<5; j++){
        //         System.out.print(twod[i][j]+" ");
        //     }
        //     System.out.println("\n");
        // }


        // practice probles 5

        // int [] arr = {1,2,3,4,5,6};
        // int n = Math.floorDiv(arr.length, 2);
        // int l = arr.length,temp;
        // for(int i = 0; i<n; i++){
        //     temp = arr[i];
        //     arr[i] = arr[l-i-1];
        //     arr[l-i-1] = temp;
        // }

        // for(int element:arr){
        //     System.out.print(element + " ");
        // }


        // practice probles 6
        // int [] arr = {1,2,3,4,5,6};
        // int max = 0;
        // for(int e:arr){
        //     if ( e > max) {
        //         max = e;
        //     }
            
        // }
        // System.out.println(max);


        // practice probles 8
        //     boolean isSorted = true;
        // int []arr = {1,2,3};
        // for(int i =0; i<arr.length-1; i++){
        //     if (arr[i] > arr[i+1]) {
        //         isSorted = false;
        //         break;

        //     }
        // }

        // if (isSorted) {
        //     System.out.println("the array is sorted");
        // }
        // else{
        //     System.out.println("the array is not sorted"
        //     );
        // }

        //  practice probles 7
        // int [] arr = {12,22,32,42,52};
        // int min = arr[0];
        // for(int e:arr){
        //     if (e < min ) {
        //         min = e; 
        //     }
        // }     
        // for(int i =0; i<arr.length; i++){
        //     if (arr[i] <min) {
        //         min = arr[i];
        //     }
        // }
        
       // System.out.println(min);
        // System.out.println(Integer.MIN_VALUE);

        // practice probles 4;

        int [][] mat1 = {{1,2,3},{4,5,6}};
        int [][] mat2 = {{1,6,13},{3,7,6}};
        int [][] result = {{0,0,0},{0,0,0}};

        for(int i =0; i<mat1.length;i++){
            for(int j=0; j<mat1[i].length; j++){
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
