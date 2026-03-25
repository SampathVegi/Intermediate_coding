import re
class Solution:

    def isPalindrome(self,s: str) -> bool:
        # remove non-alphanumeric characters
        cleaned = re.sub(r'[^a-zA-Z0-9]', '', s)
        
        # convert to lowercase
        cleaned = cleaned.lower()
        
        # check palindrome
        return cleaned == cleaned[::-1]