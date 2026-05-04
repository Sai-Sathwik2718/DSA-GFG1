import java.util.*;

class Solution {
    public static int getMaxArea(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = arr.length;

        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : arr[i];

            while (!stack.isEmpty() && currentHeight < arr[stack.peek()]) {
                int top = stack.pop();
                int height = arr[top];

                int width;
                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = height * width;
                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        return maxArea;
    }
}