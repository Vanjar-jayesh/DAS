package pattern;

public class Pyramid_Pattern_01 {
    public static void main(String[] args) {
        int n=4;
        
        for(int i =0; i<n; i++){
            for(int j = 0; i<n-i; j++){
                System.out.print(" ");
            }

            for(int j =1; j<=i+1; j++){
                System.out.print(i);
            }

            for(int j=i; j>0; j--){
                System.out.print(i);
            }
            System.out.println();

    }
}
}