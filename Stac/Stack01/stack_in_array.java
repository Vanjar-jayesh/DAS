package Stack01;

public class stack_in_array {

    public static class Stack{
      
        private int [] arr = new int[5];
        private int idx = 0;
        void push(int x ){
            if (isfull()) {
                System.out.println("stack is full : ");
                return;
            }
         
            arr[idx] = x;
            idx++;
        }

        int peek(){
            if (idx ==0) {
                System.out.println("stack is isempty");
                return-1;
                
            }
            return arr[idx-1];
        }
        

        int pop(){
            if (idx ==0) {
            System.out.println("stack is empty:");
            return -1;                
            }
            int top = arr[idx -1];
            arr[idx-1] =0;
            idx--;
            return top;
        }

        void display(){
            for(int i = 0; i<=idx-1; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        Boolean ifEmpty(){
            if (size() == 0) {
                return true;
                
            }
            else return false;
        }

        boolean isfull(){
            if (idx == arr.length) {
                return true;
                
            }
            return false;
        }

        int capscity(){
            return arr.length;
        }
        void insertAtBottom(int item) {  
            if (ifEmpty()) {  
                push(item);  
            } else {  
               int top = pop();  
                insertAtBottom(item);  
                push(top);  
            }  
        }
    
        void reverse(){
            if (!ifEmpty()) {
                int top = pop();
                reverse();
                insertAtBottom(top);     
            }
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();

        st.push(4);
        st.push(5);
        st.push(1);
        st.display(); // 4 5 1 
        System.out.println(st.size()); // 3 
        st.pop(); // 1
//  /       st.push(4);
        // st.push(4)
        st.display();//4 5
        System.out.println(st.size()); // 2

        st.reverse();
        st.display();
    }
}