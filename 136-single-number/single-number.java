class Solution {
    public int singleNumber(int[] nums) {
       HashMap<Integer,Integer> h = new HashMap<>();
       for(int e:nums)
            h.put(e,h.getOrDefault(e,0)+1);
        int result =0;
        for(int e : h.keySet()){
        if(h.get(e)==1)
            result =e;
            }
        return result; }
}