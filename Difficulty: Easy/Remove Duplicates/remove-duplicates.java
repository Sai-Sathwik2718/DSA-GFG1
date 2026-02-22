import java.util.*;

class Solution {
    String removeDups(String s) {
        
        Stack<Character> stk = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(!stk.contains(ch)){
                stk.push(ch);
            }
        }
        
        StringBuilder res = new StringBuilder();
        
        while(!stk.isEmpty()){
            res.append(stk.pop());
        }
        
        return res.reverse().toString();
    }
}