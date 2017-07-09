public boolean less20(int n) {
  if ((n +1) % 20 == 0){
    return true;
  }else if ((n +2) % 20 == 0){
    return true;
  }
  return false;
}
