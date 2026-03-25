class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        # strs.sort()
        # s=''
        # for i in range(len(strs[0])):
        #     if strs[0][i] == strs[len(strs)-1][]:
        #         s+=strs[0][i]
        # return s
        longest_pre = []
 
        if strs and len(strs) > 0:
            strs = sorted(strs) 
            first, last = strs[0], strs[-1] 
            for i in range(len(first)):
                if len(last) > i and last[i] == first[i]:
                    longest_pre.append(last[i])
                else:
                    return "".join(longest_pre)
        return "".join(longest_pre)