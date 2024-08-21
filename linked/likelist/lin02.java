package linked.likelist;

public class lin02 {
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        
        }   
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size =0;
    // inset of list in number:
        void insertATend(int val){
            Node temp = new Node(val);
            // tail.next = temp;
            // tail = temp;
            if (head==null) {
                head = temp;
                //tail = temp;
                
            }
            else{
                tail.next = temp;
               // tail = temp;

            }
            tail = temp;
            size++;
        }
// display for the list function
        void display(){ 
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+" ");
                temp= temp.next;
            }
            System.out.println();
        }
// print the size of list in function
        int size(){
        //     Node  temp = head;
        //     int count=0;
        //     while (temp != null) {
        //         count++;
        //         temp = temp.next;

                
        //     }
        //     return count;
        return size;
        } 
        // add the fist head for values;
       void insertATHead(int val){
                  Node temp = new Node(val);
              if (head==null) {//empty list
                 // head=tail=temp;
                 insertATend(val);

                }
              else{//non empty list
                   temp.next = head;
                  head = temp;
               }
               size++;
             }

//insert in index
      void insertAT(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if (idx==size()) {
                insertATend(val);
                return;
            }
            else if (idx == 0) {
               insertATHead(val);
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
            size++;
        }
// getelement method
        // int getindex(int idx){
        //     Node temp = head;
            
        //      if(idx <0 || idx>size()){
        //         System.out.println("wrong index");
        //         return -1;
        //     }
        //     for(int i =1; i<=idx;i++){
        //         temp = temp.next;
        //     }
        //  return temp.data;   
        // }

        // void daleteAT(int idx){
        //     if (idx==0) {
        //         head = head.next;
        //         size--;
        //         return;
        //     }
        //     Node temp = head;
        //     for (int i = 1; i <=idx-1; i++) {
        //         temp = temp.next;
        //     }
        //     temp.next = temp.next.next;
        //     tail = temp;
        //     size--;
        // }

    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        //ll.add(4); 
     //   ll.add(5);
       ll.insertATend(4);
     //  ll.display();
       ll.insertATend(5);
       ll.insertATend(12);
       ll.insertATend(11);
       ll.insertATend(511);
       ll.insertATend(121);
       ll.display();

       ll.insertAT(6, 650);
       ll.display();
       System.out.println(ll.tail.data);

      // ll.display();

        //ll.display();
        // System.out.println(ll.size());
     //   ll.insertATend(12);
       // ll.display();

      //  ll.insertATHead(13);
      //  ll.display();
      //  ll.insertAT(4, 10);
      //  ll.display();
        //System.out.println( ll.tail.data);
       // System.out.println(ll.head.data);
      // ll.insertAT(0, 100);
      // ll.display();

      // System.out.println(ll.getindex(3));
      // System.out.println(ll.size);

    //   ll.daleteAT(0);
      // ll.display();
      // System.out.println(ll.head.data);
    }
}
