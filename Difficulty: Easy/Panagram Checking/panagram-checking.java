class Solution {
    public static boolean checkPangram(String s) {
        // code here
        for(char i='a';i<='z';i++){
            boolean fnd=false;
            for(int j=0;j<s.length();j++){
                if(i==Character.toLowerCase(s.charAt(j))){
                    fnd=true;
                    break;
                }
            }
            if(fnd==false){
                return false;
            }
            
        }
            return true;
    }
}