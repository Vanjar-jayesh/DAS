package array01;

import java.util.HashSet;
import java.util.Set;

public class appears {
    public static boolean app(int [] nums){
        int n = nums.length;
        Set<Integer> un = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (un.contains(nums[i])) {

                return true;
            }
           un.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums [] = {1,2,3,3};

        System.out.println(app(nums));


        
    }
    
}
