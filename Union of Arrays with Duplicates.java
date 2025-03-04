
class Solution {
    public static int findUnion(int a[], int b[]) {
         HashSet<Integer>set=new HashSet<>();
        for(int n:a){
            set.add(n);
        }
        for(int n:b){
            set.add(n);
        }
        return set.size();
    }
}