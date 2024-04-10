
class Solution{
    static int findSingle(int n, int arr[]){
        Arrays.sort(arr);
        int i=0;
        
        for(i=0;i<arr.length-1;i++){
            int j=i+1;
            if(arr[i]!=arr[j]){
                break;
            }
            i++;
        }
        
        return arr[i];
    }
}