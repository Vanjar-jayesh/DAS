package Linked_list_01;

import Stack01.stack_in_array;

public class implementation02 {
    public static class Node{
        int date;
        Node next;
        Node(int date){
            this.date=date;
            this.next =null;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertEnd(int val){
            Node temp = new Node(val);
            if (head==null) {
                head = temp;  
            }
            else{
                tail.next = temp;   
            }
            tail = temp;
        }

        // display the linked list 
        void display(){
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.date+" ");
                temp = temp.next;   
            }
        //    System.out.println();
        }

        // length 
        int size(){
             
            int count =0;
            while (head!=null) {
                count++;
                head = head.next;
            }
            
            //System.out.println(count);
            return count;
        }
        // insert of the head 
        void inserthead(int val){
            Node temp = new Node(val);
            if (head==null) {
                // head = tail = temp;
                insertEnd(val);
            }
            else{
                temp.next = head;
                head = temp;
            }

        }
        // add the index based value 
        void insertAt(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if (idx==size()) {
                insertEnd(val);
                return;
            }
            else if (idx == 0) {
               inserthead(val);
                return;
                
            }
            else if(idx <0 || idx>size()){
                System.out.println("wrong index");
                return;
            }
            
            for (int  i = 1; i <=idx-1; i++) {
                temp = temp.next;
            }
            t.next=temp.next;
            temp.next =t;
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();

        ll.insertEnd(4);
        ll.insertEnd(5);
        ll.insertEnd(6);
        //ll.display();
        ll.inserthead(10);
         ll.display();

       ll.insertAt(4, 7);
        ll.display();
        System.out.println();
    //    System.out.println(ll.tail.date);
       ll.insertAt(2, 12);
       ll.display();
       // ll.display();
      
    }
}
