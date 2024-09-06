package pattern;

public class Hollow_diamond_pattern {
     public static void main(String[] args) {
        int n=4;

        for(int i =0; i<n; i++){
          for(int j = 0; j<n-i-1; j++){
              System.out.print(" ");
            }
              System.out.print("*");

              if (i != 0) {
                for(int j = 0; j<2*i-1; j++){
                    System.out.print(" ");
                  }
                  System.out.print("*");
              }
              System.out.println();
        }

        for(int i=0; i<n-1; i++){
            for(int j = 0; j<i+1; j++){
                System.out.print(" ");
              }



            System.out.print("*");
            if (i != n-2) {
                for(int j = 0; j<2*(n-i)-5; j++){
                    System.out.print(" ");
                  }
                
                System.out.print("*");
            }
            System.out.println();
             
        }
   
  }

}

