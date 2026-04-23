class Solution {
    public boolean isAnagram(String s, String t) {
          char [] chars = s.toCharArray();
          Arrays.sort(chars);
          char [] chars2 = t.toCharArray();
          Arrays.sort(chars2);
          if(chars.length!=chars2.length) return false;
          for(int i =0; i <chars.length && i <chars2.length;i++){
            if(chars[i]!=chars2[i]){
                return false;
            }
           
          }
          return true;

    }
}
