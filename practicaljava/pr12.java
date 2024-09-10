package practicaljava;

public class pr12 {
    public static void main(String[] args) {
        
        int [] arr = {2,3,1,4,5};

        for (int i = 0; i <=arr.length; i++) {
            
            for(int j =i+1; j<arr.length; j++){
                if (arr[i] > arr[j]) {
                    
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            
        }

        System.out.println("sortes array elements: ");

        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

OUTPUT:
sortes array elements: 
1 2 3 4 5 
