class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        for i in range(0,len(nums)):
            if(i<len(nums)):
                for j in range(i+1,len(nums)):
                    if(nums[i]+nums[j]==target):
                        return [i,j]
        return []
