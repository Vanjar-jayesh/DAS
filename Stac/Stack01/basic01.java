package Stack01;

import java.util.Stack;

/**
 * basic01
 */
public class basic01 {

public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();

    st.push(1);
    st.push(2);
    st.push(3);
    st.push(5);
    st.push(4);
    
    System.out.println(st);


   
    // print the ont stack to another stack 
    // Stack<Integer> rt =  new Stack<>();

    // while (st.size()>0) {
    //     rt.push(st.pop());
    // }

    // while (rt.size()>0) {
    //     int x = rt.pop();
    //     System.out.print(x+" ");
    //     st.push(x);
        
    // }
    // System.out.println();
    // System.out.println(st);
 
 /* print the value is stack in the array forment 

    int n =st.size();
    int [] arr = new int[n];
    for (int i =n-1; i>=0 ; i--) {
        arr[i] = st.pop();
        
    }

    for(int i = 0; i<n; i++){
        int  x = arr[i];
        System.out.println(arr[i]);
        st.push(x);
    }
  */

  /*
   *  this function is use the removeing from bottom fo any index of the stack: 
   
  Stack<Integer> rt =  new Stack<>();

  while (rt.size()>1) {
    rt.push(st.pop());

    
  }
  st.pop();

  while (rt.size()>0) {
    st.push(rt.pop());
    
   }

   System.out.println(st);
   System.out.println(rt);
   */

     }


}