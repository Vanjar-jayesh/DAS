public class jumpContinuest {
    public static void main(String[] args) {
        outer: for (int i = 0; i < 8; i++) {
            for(int j =0; j<8; j++){
                if (j > i) {
                    System.out.println("\n");
                    continue outer;
                }
                System.out.print(" " + (i*j));
            }
        }
        System.out.println("\n");
    }
}

