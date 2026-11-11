class Solution {
    public int findNumbers(int[] nums) {
        int count =0;

        for(int i=0;i<nums.length;i++){
            int digit=0;
            int nu=nums[i];

            while(nu>0){
                digit++;
                nu=nu/10;
            }

            if(digit % 2 ==0){
                count++;
            }
        }
        return count;
    }
}