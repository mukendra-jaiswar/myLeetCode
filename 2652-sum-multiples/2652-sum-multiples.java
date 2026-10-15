class Solution {
    public int sumOfMultiples(int n) {
        int num1=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        { 
            num1++;

            if(num1%3==0 ||num1%5==0 || num1%7==0)
            {
               sum+=num1;
            }
        }
        return sum;
        
    }
}