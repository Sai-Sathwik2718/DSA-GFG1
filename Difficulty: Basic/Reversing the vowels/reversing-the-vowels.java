// User function Template for Java

class Solution {
    String modify(String s) {
        // your code here
        char[] arr=s.toCharArray();
        Set<Character> vowels=new HashSet<>();
        for(char c:"AEIOUaeiou".toCharArray()){
            vowels.add(c);
        }
        int left=0,right=arr.length-1;
        while(left<right){
            while(left<right && !vowels.contains(arr[left])){
                left++;
            }
            while(left<right && !vowels.contains(arr[right])){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}