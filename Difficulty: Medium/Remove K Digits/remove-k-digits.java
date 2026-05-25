class Solution {
    public String removeKdig(String s, int k) {
        // code here
        Stack<Character> stk=new Stack<>();
        int n=s.length();
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && (k>0) && s.charAt(i)<stk.peek()){
                stk.pop();
                k--;
            }
            stk.push(s.charAt(i));
        }
        while(k>0){
            stk.pop();
            k--;
        }
        StringBuilder sb=new StringBuilder();
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        sb.reverse();
        while(sb.length()>0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        return sb.length()==0?"0":sb.toString();
    }
}