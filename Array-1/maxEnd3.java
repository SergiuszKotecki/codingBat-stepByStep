public int[] maxEnd3(int[] nums) {
  
  if (nums[0] >= nums[2]){
    for (int i=0; i<nums.length; i++ ){
      nums[i] = nums[0];
    }
  }else if  (nums[0] < nums[2]){
    for (int i=0; i<nums.length; i++ ){
      nums[i] = nums[2];
    }
  }return nums;
  
  
}