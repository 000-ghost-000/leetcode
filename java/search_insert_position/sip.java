class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                return i;
            }
        }
        int j=0;
        for(j=0;j<nums.length;j++)
        {
            if(target<nums[j])
            {
                return j;
            }
        }
        return j;
    }
}
