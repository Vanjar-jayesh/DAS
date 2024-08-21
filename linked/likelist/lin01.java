package linked.likelist;

import javaim.pr1;

public class lin01 {
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    // print the lent:
    public static int lent(Node head){
        int count=0;
        while (head!=null) {
            count++;
            head = head.next;
        }
        return count;
    }

//print lisr in  recning
    public static void displayr(Node head){
        if (head == null) {
          
            return;
        }
        displayr(head.next);
        System.out.println(head.data);
        

    }
   public static class  Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }


    }

    public static void insertATEnd(Node head,int val){
        Node temp = new Node(val);
        Node t= head;
        while (t.next!=null) {
            t = t.next;
        
        }
        t.next = temp;

    }
    
    public static void main(String[] args) {
            Node a = new Node(5);
            Node b = new Node(3);
            Node c = new Node(9);
            Node d = new Node(8);
            Node e = new Node(19);

            // 5-> 3->9->8->19

            a.next = b; // 5 -> 3 9 8 19
            b.next = c; // 5-> 3->9 8 19
            c.next = d;// 5-> 3->9->8 19
            d.next = e;// 5-> 3->9->8->19
            // System.out.print(a.data);
            // System.out.print(b.data);
            // System.out.print(c.data);
            // System.out.print(d.data);            
            // System.out.print(e.data);
 
            // System.out.println(a.data);
            // System.out.println(a.next.data);
            // System.out.println(a.next.next.data);
            // System.out.println(a.next.next.next.data);
            // System.out.println(a.next.next.next.next.data);
         //   Node temp = a;
            // System.out.println(temp.data);
            // for (int i = 0; i <=5; i++) {//print the linklist in using loop:
            //     System.out.println(temp.data);
            //     temp = temp.next;
            // }

            // print the list in while loop
            // while (temp !=null) {
            //     System.out.println(temp.data);
            //     temp = temp.next;
            // }


            // call the function to pritn the list 
          //  display(a);
         // displayr(a);

        //   System.out.println(lent(a));
        
       // insertATEnd(87);
        //System.out.println(head);
     
        insertATEnd(a, 87);
        display(a);
           



            


    }
}
