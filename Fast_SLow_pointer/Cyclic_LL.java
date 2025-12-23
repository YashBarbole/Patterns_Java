package Fast_SLow_pointer;

public class Cyclic_LL {
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

        System.out.println(DetectCycle(head)); // true
        
    }

    public static boolean DetectCycle(Node head){
        if(head==null) return false;
        Node slow=head;
        Node fast= head;


        while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;

        if(slow==fast){
            return true;
        }
        }
        return false;
       



    }
}
