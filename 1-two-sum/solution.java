// 50 ms | 45 MB
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] test = new int[2];
        for(int i=0;i<nums.length;i++){
            //int sum=nums[i];
            for(int j=i+1;j<nums.length;j++){
                if(target==(nums[i]+nums[j])){
                    test[0]=i;
                    test[1]=j;
                }
            }
        }
        return test;
    }
}