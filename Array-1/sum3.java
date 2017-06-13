public int sum3(int[] nums) {
  // return nums[0] +nums[1] +nums[2];
  int sum = 0;
  for (int i=0; i<3; i++){
    sum += nums[i];
  }
  return sum;
  
}