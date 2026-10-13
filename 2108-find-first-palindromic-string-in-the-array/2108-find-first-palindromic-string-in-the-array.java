class Solution {
    public String firstPalindrome(String[] words) {
     
        for(int i=0;i<words.length;i++)
        {
            char arr[]=words[i].toCharArray();
            int left=0;
            int right=arr.length-1;
            boolean isPalindrom=true;
            while(left<right)
            {
                if(arr[left]!=arr[right])
                {
                  isPalindrom=false;
                  break;
                }
                left++;
                right--;
            }

            if(isPalindrom)
            {
            return words[i];
            }
         
        }
 
            return "";
      
    }
        
    
}