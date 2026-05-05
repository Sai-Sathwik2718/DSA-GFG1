class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                ar.add(i);
                if(i!=n/i){
                    ar.add(n/i);
                }
            }
            
        }
        Collections.sort(ar);
        return ar;
    }
}