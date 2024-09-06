package pattern;

public class Triangle_Pattern_03 {
    public static void main(String[] args) {
        int n =4;
         for(int i=0; i<n; i++){
            for(int j=i+1; j>0; j--){
                System.out.print(j);
            }
            System.out.println();
         }
    }
}
