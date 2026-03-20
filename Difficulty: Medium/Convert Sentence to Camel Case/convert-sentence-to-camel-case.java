// User function Template for Java

class Solution {
    // Function to convert the given string to Camel Case
    public String convertToCamelCase(String s) {
        // code here
        StringBuilder res=new StringBuilder();
        boolean capitalize=false;
        for(int i=0;i<s.length();i++){
            
        
        if(s.charAt(i)==' '){
            capitalize=true;
        }
        else if(capitalize==true){
            res.append(Character.toUpperCase(s.charAt(i)));
            capitalize=false;
        }else{
            res.append(s.charAt(i));
        }
        }
        return res.toString();
    }
}