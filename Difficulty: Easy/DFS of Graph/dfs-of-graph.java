class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> result = new ArrayList<>();
        int V = adj.size();

        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();

        stack.push(0);   // Start from node 0

        while (!stack.isEmpty()) {

            int node = stack.pop();

            if (!visited[node]) {
                visited[node] = true;
                result.add(node);

                // Reverse order to maintain DFS order
                ArrayList<Integer> neighbours = adj.get(node);
                for (int i = neighbours.size() - 1; i >= 0; i--) {
                    int neighbour = neighbours.get(i);
                    if (!visited[neighbour]) {
                        stack.push(neighbour);
                    }
                }
            }
        }

        return result;
    }
}