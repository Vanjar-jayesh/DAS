package linked.likelist;


public class lonkedlist03 {

    public static Node nthNode(Node head,int n){
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp  = temp.next;

            
        }
        int m = size - n+1;
        temp = head;
        for(int i=1; i<=m-1;i++){
            temp = temp.next;
        }
        return temp;
    }

    public static Node nthNode1(Node head, int n){
        Node slow = head;
        Node fast = head;
        for(int i = 1; i<=n; i++){
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
    public static Node daleteAT(Node head ,int n){
            Node slow = head;
            Node fast = head;

            for(int i = 1; i<=n; i++){
                // slow = slow.next;
                fast = fast.next;
            }
            if (fast == null) {
                head = head.next;
                return head;
                
            }
            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;

           
            return head;

       
    }

    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
            
        }
        System.out.println();
    }
  public static  class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        // this.next = next;
    }


 }
    

    public static void main(String[] args) {
        
        
        Node a = new Node(12);
        Node b = new Node(23);
        Node c = new Node(11);
        Node d = new Node(121);
        Node e = new Node(123);
        Node f = new Node(124);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        // Node q = nthNode1(a,2 );
        // System.out.println(q.data);

        
        display(a);
          a = daleteAT(a, 6);
       // System.out.println(a.data);
        display(a);
    }
    
}
