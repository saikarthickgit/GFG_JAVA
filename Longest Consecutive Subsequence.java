class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
       
        
        Arrays.sort(arr);
        int max=1,result=1;
         if (arr.length==0) return result;
        int temp;
        for(int i=0;i<arr.length-1;i++){
          
            if(arr[i]+1==arr[i+1]){
            max++;
              result= Math.max(result, max);
            }else if(arr[i]==arr[i+1]){
               continue;
              
            }else{
                  max=1;
            }
          
        }
        
        return result;
    }
}