class Solution {
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<V;i++){
            res.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            res.get(u).add(v);
            res.get(v).add(u);
        }
        boolean[] visited=new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,-1,visited,res)){
                    return true;
                }
            }
            
        }
        return false;
    }
    public static boolean dfs(int node,int parent,boolean[] visited,ArrayList<ArrayList<Integer>> res){
        visited[node]=true;
        for(int neighbour:res.get(node)){
            if(!visited[neighbour]){
                if(dfs(neighbour,node,visited,res)){
                    return true;
                }
            }else if(neighbour!=parent){
                return true;
            }
        }
        return false;
    }
}