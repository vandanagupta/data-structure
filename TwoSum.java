class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int result[] = {0,0};
        int i = 0, sum = 0;
        int p1 =0 , p2 = 1;
        Arrays.sort(nums);
        System.out.println("nums = " + Arrays.toString(nums));
        for(p1 =0; p1 < nums.length; ) {
            sum = nums[p1] + nums[p2];
            if(sum == target) {
                result[0] = p1;
                result[1] = p2;
                return result;
            } else if( sum < target){
                p2++;
            } else if (sum > target) {
                p1++;
            }
        }
        return result;

    }
}
