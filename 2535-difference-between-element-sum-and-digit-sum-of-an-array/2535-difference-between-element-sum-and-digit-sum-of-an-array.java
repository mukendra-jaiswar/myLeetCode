class Solution {
    public int elementSumf(int []nums)
    {
         int sum=0;
         for(int i=0;i<nums.length;i++)
         {
            sum+=nums[i];
         }  
         return sum;
    }


    public int digitSumf(int []nums)
    {
        int sum=0;
      for(int i=0;i<nums.length;i++)
      {
        int cnum=nums[i];
           while(cnum>0)
           {
            int rem=cnum%10;
            sum=sum+rem;
            cnum=cnum/10;
           }

      }
      return sum;

    }

    public int differenceOfSum(int[] nums) {
        int elementSum=elementSumf(nums);
        int digitSum=digitSumf(nums);
        return Math.abs(elementSum-digitSum);
        
    }
}