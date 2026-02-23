class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Step 2: Fill adjacency list
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);  // Directed edge
        }

        boolean[] visited=new boolean[V];
        boolean[] resstack=new boolean[V];
        for(int i=0;i<V;i++){
            
            if(!visited[i]){
                if(dfs(i,visited,resstack,adj)){
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean dfs(int node,boolean[] visited,boolean[] resstack,ArrayList<ArrayList<Integer>> adj){
        visited[node]=true;
        resstack[node]=true;
        for(int neighbour:adj.get(node)){
            if(!visited[neighbour]){
                if(dfs(neighbour,visited,resstack,adj)){
                    return true;
                }
            }else if(resstack[neighbour]){
                return true;
            }
        }
        resstack[node]=false;
        return false;
    }
}