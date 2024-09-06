package pattern;

public class Inverted_Triangle_pattern_01 {
    public static void main(String[] args) {
        int n=4;

        // for(int i =1; i<n; i++){
        //     for(int j = i+1; j>0; j--){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();+
        // }

        for(int i = 0; i<n; i++){
            for(int j= 0; j<i; j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k < n-i; k++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
           
        }
    }
}
