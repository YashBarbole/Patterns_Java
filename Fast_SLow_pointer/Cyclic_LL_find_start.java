package Fast_SLow_pointer;

public class Cyclic_LL_find_start {
    static class Node{
            int val;
            Node next;

            Node(int val){
                this.val=val;
                this.next=null;
            }
    }

    public static void main(String[] args) {
         Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        // Create cycle: 4 → 2
        head.next.next.next.next = head.next;

       Node res=FindStart(head);
       System.out.println(res.val);
    }

    static Node FindStart(Node head){
        Node s=head;
        Node f=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;

            if(s==f){
                break;
            }
        }

        if(f==null || f.next==null) return null;

        s=head;
        while(s!=f){
            s=s.next;
            f=f.next;
        }
        return s;
    }
}
