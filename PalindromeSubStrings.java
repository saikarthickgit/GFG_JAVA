class Solution {
    // Method to check if a substring is a palindrome
    private boolean checkPal(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
             
            }
            i++;
            j--;
        }
        return true;
    }

    public int countPS(String s) {
        int count = 0;
    
        int n = s.length();
        if(n==1 ||n ==0) return 0;

        // Iterate over all possible substrings
        for (int i = 0; i < n-1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (checkPal(s, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
}
