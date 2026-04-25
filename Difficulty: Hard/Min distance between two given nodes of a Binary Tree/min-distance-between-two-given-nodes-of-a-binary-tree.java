class GfG {

    // Find LCA of two nodes
    Node findLCA(Node root, int a, int b) {
        if (root == null) return null;

        if (root.data == a || root.data == b)
            return root;

        Node left = findLCA(root.left, a, b);
        Node right = findLCA(root.right, a, b);

        if (left != null && right != null)
            return root;

        return (left != null) ? left : right;
    }

    // Find distance from given node to target
    int findLevel(Node root, int target, int level) {
        if (root == null) return -1;

        if (root.data == target)
            return level;

        int left = findLevel(root.left, target, level + 1);
        if (left != -1) return left;

        return findLevel(root.right, target, level + 1);
    }

    // Main function
    int findDist(Node root, int a, int b) {
        Node lca = findLCA(root, a, b);

        int d1 = findLevel(lca, a, 0);
        int d2 = findLevel(lca, b, 0);

        return d1 + d2;
    }
}