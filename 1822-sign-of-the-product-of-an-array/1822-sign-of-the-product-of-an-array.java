class Solution {
    public int signFun(int x)
    {
        if(x>0)
        return 1;
        else if(x<0)
        return -1;
        else 
        return 0;
    }
    public int arraySign(int[] nums) {
        int mult=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                mult=mult;
            }else if(nums[i]<0)
            {
                mult=-mult;
            }
            else
            {
                mult=0;
            }

        }
        int res=signFun(mult);
        return res;
        
    }
}