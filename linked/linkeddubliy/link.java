
package linked.linkeddubliy;

public class link {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    public static void displayhead(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
                temp = temp.next;
            
        }
        System.out.println();
    }
    public static void displayhead2(Node tail ){
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val+" ");
                temp = temp.prev;
            
        }
        System.out.println();
    }

    public static void display3(Node random){
        Node temp = random;
        //move this temp backwarrds to the headd
        while (temp.prev!= null) {
           // System.out.print(temp.val+" ");
                temp = temp.prev;
            
        }
        while (temp != null) {
            System.out.print(temp.val+" ");
                temp = temp.next;
            
        }
        System.out.println();
        
    }

    public static Node indsertAthead(Node head,int x){
        Node t = new Node(x);
        t.next= head;
        head.prev= t;
        head = t;
        return head;
    }

    public static void insertATtail(Node head,int x){
        Node temp = head;
        while (temp.next!=null) {
            temp= temp.next;
            
        }
        Node t = new Node(x);
        temp.next = t;
        t.prev = temp;

    }
// add the index in the
    public static void indsertAtIdx(Node head,int idex,int x){
         Node s = head;
         for (int i = 1; i <=idex-1; i++) {
            s= s.next;
         }
         // s is at ind-1 position
         Node r = s.next;//idex
         Node t = new Node(x);
         s.next =t;
         t.prev = s;
         t.next = r;
         r.prev = t;
    }
    public static void main(String[] args) {
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);
        a.prev= null;
        a.next = b;
        b.prev = a;
        b.next= c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next =e;
        e.prev = d;
        e.next=null;
        // displayhead(a);
        // displayhead2(e);
        // display3(c);
        // Node newHead = indsertAthead(a, 25);
        // displayhead(newHead);
        displayhead(a);
        insertATtail(a, 90);
        displayhead(a);

        indsertAtIdx(a, 3, 56);
        displayhead(a);



    }
    
}
