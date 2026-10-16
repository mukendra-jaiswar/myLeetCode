class Solution {
    public boolean canAliceWin(int[] nums) {
         int sum1=0;
            int sum2=0;
        for(int i=0;i<nums.length;i++)
        {
           
            int length=String.valueOf(nums[i]).length();
            if(length<=1)
            sum1+=nums[i];
            else
            sum2+=nums[i];
         


        }
           return sum1 != sum2;
    }
    
}