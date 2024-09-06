package pattern;

public class Triangle_Pattern_01 {
    public static void main(String[] args) {
        int n =4;

        for(int i = 0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
