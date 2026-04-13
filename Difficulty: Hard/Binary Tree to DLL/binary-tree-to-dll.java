class Solution {
    
    Node prev = null;  // to keep track of previous node
    Node head = null;  // head of DLL
    
    Node bToDLL(Node root) {
        inorder(root);
        return head;
    }
    
    void inorder(Node root) {
        if (root == null) return;
        
        // Step 1: Left subtree
        inorder(root.left);
        
        // Step 2: Process current node
        if (prev == null) {
            head = root;   // first node becomes head
        } else {
            prev.right = root;  // link previous → current
            root.left = prev;   // link current → previous
        }
        
        prev = root;  // update prev
        
        // Step 3: Right subtree
        inorder(root.right);
    }
}