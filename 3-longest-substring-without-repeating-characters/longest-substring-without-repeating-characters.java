class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0,maxLen=0;
        HashMap <Character,Integer> h = new HashMap<>();
        for(int right =0;right<s.length();right++){
            while(h.containsKey(s.charAt(right)) && h.get(s.charAt(right)) >0){
                h.put(s.charAt(left),h.get(s.charAt(left))-1);
                left++;
            }
            h.put(s.charAt(right),h.getOrDefault(s.charAt(right),0)+1);
            maxLen =Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
