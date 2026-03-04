class Solution {
    public int orangesRot(int[][] mat) {
        // code here
        int rows=mat.length;
        int cols=mat[0].length;
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(mat[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(mat[i][j]==1){
                    fresh++;
                }
            }
        }
        int time=0;
        int[] dr={-1,1,0,0};
        int[] dc={0,0,-1,1};
        while(!q.isEmpty() && fresh>0){
            int size=q.size();
            for(int i=0;i<size;i++){
                int[] cell=q.poll();
                int r=cell[0];
                int c=cell[1];
                for(int k=0;k<4;k++){
                    int nr=r+dr[k];
                    int nc=c+dc[k];
                    if(nr>=0 && nc>=0 && nr<rows && nc<cols && mat[nr][nc]==1){
                        mat[nr][nc]=2;
                        q.add(new int[]{nr,nc});
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh==0?time:-1;
    }
}