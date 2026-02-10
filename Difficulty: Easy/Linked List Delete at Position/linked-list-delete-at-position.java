// User function Template for Java

/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Delete {
    Node deleteAtPosition(Node head, int pos) {
        // your code here
        if(head==null){
            return head;
        }
        pos=pos-1;
        if(pos==0){
            head=head.next;
            return head;
        }
        Node temp=head;
        for(int i=0;temp!=null && i<pos-1;i++){
            temp=temp.next;
        }
        if(temp==null || temp.next==null){
            return head;
        }
        temp.next=temp.next.next;
        
        return head;
    }
}
