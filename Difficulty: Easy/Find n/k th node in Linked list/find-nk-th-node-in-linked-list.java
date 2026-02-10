/*
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/

class Solution {
    public static int fractional_node(Node head, int k) {
        // Your code here
        if(head==null||k<=0) return -1;
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            cnt++;
            temp=temp.next;
        }
        int n=cnt;
        int res=(n+k-1)/k;
        if(res==0) return -1;
        temp=head;
        for(int i=1;i<res;i++){
            temp=temp.next;
        }
        return temp.data;
        
    }
}