class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i = 0;
        HashSet<Integer> map = new HashSet<>(); 
        for(i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        if(map.size() != nums.length){
            return true;
        }
        else{
            return false;
        }
    }
}