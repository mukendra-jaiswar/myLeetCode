class Solution {
    public void helperReverse(int arr[],int left,int right)
    {
        while(left<=right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        int l=0;
        k=k%nums.length;
        int r=nums.length-1;
        helperReverse(nums,l,r);
        helperReverse(nums,l,k-1);
        helperReverse(nums,k,r);
        

    }
}