/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Node> n=new LinkedList<>();
        Node temp=root;
        n.add(temp);
        // if(root==null) return ans;
        // n.offer(root);
        while(!n.isEmpty()){
            int level=n.size();
            for(int i=0;i<level;i++){
                Node curr=n.poll();
                if(i==0){
                    ans.add(curr.data);
                }if(curr.left!=null){
                    n.add(curr.left);
                }if(curr.right!=null){
                    n.add(curr.right);
                }
            }
        }
        return ans;
        
    }
}