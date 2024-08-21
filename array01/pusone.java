package array01;

import java.util.Arrays;

/**
 * pusone
 */
public class pusone {

    public static int[] printpuslone(int digits[]){
        for (int i=digits.length-1; i>=0; i--) {
            if (digits[i]<9) {
                digits[i]++;
                return digits;
            }
            digits[i] =0;

    }
    int [] newnumber = new int [digits.length + 1];
    newnumber[0] =1;
    return newnumber;
    
}

    public static void main(String[] args) {
             int [] digits = {1,2,3};
System.out.println(Arrays.toString(printpuslone(digits)));


            //     System.out.println(digits[i]);
                
            //  }

             //int re =0;
             
            //  for (int i = 0; i < digits.length; i++) {
               
            //   // if (digits[i] < 0) {
                
            //     if (digits[i] == digits[i]) {

            //         re =  digits[i] + 1;
                     
            //      }
                
            //  //  }
            //     System.out.println(re);
            //  }

            // for(int re : digits){
            //     System.out.println(re+1);
            // }
           
    } 
}