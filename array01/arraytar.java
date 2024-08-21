package array01;

public class arraytar {
public static void tar(int [] candidates ,int tre){

    int n = candidates.length;
    for (int i = 0; i <n; i++) {
        if (tre == candidates[i]) {
           System.out.println("target is found");
        }
        System.out.println(candidates[i]);
      
        
    }
}
    public static void main(String[] args) {
        int candidates [] ={2,3,6,7};
        int tre = 7;
        tar(candidates, tre);

    }
    
}
