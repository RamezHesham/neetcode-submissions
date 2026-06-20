class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> s = new HashSet <>();
        int longest =0;
        for (int n :nums) {
            s.add(n);
        }
         for (int n :s) {
            
            if (!s.contains(n-1)){
              int length =1;
              while(s.contains(n+length)){
                length++;
              }
                 longest =Math.max(length,longest);
            }
         }    return longest;
      
    }
 
}
