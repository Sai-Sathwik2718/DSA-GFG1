class Solution {
    public String reverseWords(String s) {
        String temp = "";
        String ans = "";

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch != '.'){
                temp += ch;
            } 
            else{
                if(!temp.equals("")){
                    if(ans.equals("")){
                        ans = temp;
                    } else{
                        ans = temp + "." + ans;
                    }
                    temp = "";
                }
            }
        }

        if(!temp.equals("")){
            if(ans.equals("")){
                ans = temp;
            } else{
                ans = temp + "." + ans;
            }
        }

        return ans;
    }
}