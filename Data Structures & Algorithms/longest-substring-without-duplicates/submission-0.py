from collections import Counter
class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
         start =0
         longest =0
         windowCounter = Counter()
         for end in range(len(s)):
            leading_char = s[end]
            windowCounter[leading_char] +=1
            while(windowCounter[leading_char]>1):
                trailing_char = s[start]
                windowCounter[trailing_char]-=1
                start+=1
            longest = max(end-start+1,longest)
         return longest
            
            
        