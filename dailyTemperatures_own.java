class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] arr = new int[n];

        if (n <= 1) return arr;

        for (int i = 0; i < n - 1; i++) {
            arr[i] = repeat(i, temperatures);
        }

        return arr;
    }

    private int repeat(int i, int[] temperatures) {
        int temp = temperatures[i];
        int count = 0;

        for (int j = i + 1; j < temperatures.length; j++) {
            count++;
            if (temperatures[j] > temp) {
                return count;  // Found warmer day
            }
        }

        return 0; // No warmer day found
    }
}
