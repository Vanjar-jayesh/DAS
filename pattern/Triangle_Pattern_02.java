package pattern;

public class Triangle_Pattern_02 {
    public static void main(String[] args) {
        int n=4;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j <i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
