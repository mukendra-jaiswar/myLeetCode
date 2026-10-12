class Solution {
    // public static int digitSum(int num)
    // {
    //     int sum=0;
    //     int rem=0;
    //     while(num>0)
    //     {
    //         rem=num%10;
    //         sum+=rem;
    //         num=num/10;
    //     }
    //     return sum;

    // }
    public int addDigits(int num) {
        int sum=0;
        while(num>0)
        {
           int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        if(sum<=9)
        return sum;
    return addDigits(sum);
      
}
}