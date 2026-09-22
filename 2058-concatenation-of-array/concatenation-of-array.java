class Solution {
    public int[] getConcatenation(int[] nums) {
    int[] ans = new int[2*nums.length];
    int i;
    int n;
    for(n=0;n<2*nums.length;n++){
        if(n>=nums.length){
        i = n-nums.length;}
        else{i=n;
        }
        ans[n]=nums[i];
    
        
    }
    return ans;
     
    }
}