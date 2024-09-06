package pattern;

public class Floyds_Triangle_Pattern_01 {
    public static void main(String[] args) {
        int n = 4;
        int num =1;

        for(int i =0; i<n; i++){
            for(int j =0; j<i+1; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
