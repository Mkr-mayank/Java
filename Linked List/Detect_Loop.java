public class Detect_Loop extends Linkedlist{
    //Floyd's Cycle Finding Algorithm
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        head=new Node(7);
        head.next=new Node(2);
        head.next.next=new Node(2);
        head.next.next.next=new Node(5);
        head.next.next.next.next=head.next;
        System.out.println(isCycle());
    }
}
