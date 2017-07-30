public boolean double23(int[] nums) {
  
  if (nums.length>1){
  return ((nums[0]== 2 && nums[1]==2)||(nums[0]== 3 && nums[1]==3));  
  }
  return false;
  
}
