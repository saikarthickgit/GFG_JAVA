import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];  // result array
        Stack<Integer> stack = new Stack<>();  // stores indices of unresolved days

        for (int i = 0; i < n; i++) {
            // Resolve all previous days that are cooler than current
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                arr[prevIndex] = i - prevIndex; // days until warmer temperature
            }
            stack.push(i);  // add current day index to stack
        }

        return arr;  // remaining indices in stack will automatically have 0
    }
}
