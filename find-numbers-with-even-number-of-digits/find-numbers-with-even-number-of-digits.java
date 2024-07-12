class Solution {
    public int findNumbers(int[] nums) {
        
        float temp = 0;
        int count = 0;
            
        for(int i = 0; i < nums.length; i++){
            
            temp = nums[i];
            
            if(temp > 9){
                temp = ((int) Math.floor(Math.log10(temp)) + 1);
                    if(temp % 2 == 0){
                        count += 1;
                    }
        
            }
        }
        return count;
    }
}