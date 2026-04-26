/*
class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        if (root == null) return result;
        boolean lefttoright=true;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size=q.size();
            ArrayList<Integer> res=new ArrayList<>();
            // store in single list
            for(int i=0;i<size;i++){
            Node curr = q.poll();
            res.add(curr.data);
           
            
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
                
            }
            if(!lefttoright){
                Collections.reverse(res);
            }
            result.addAll(res);
            lefttoright=!lefttoright;
        }
        
        return result;
        
        
        
    }
    
}