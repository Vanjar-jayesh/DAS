package linked.linkeddubliy;

public class linkedlist01 {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }

    public static Node indsertAthead(Node head,int x){
        Node t = new Node(x);
        t.next= head;
        head.prev= t;
        head = t;
        return head;
    }
    
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        

    }
}
