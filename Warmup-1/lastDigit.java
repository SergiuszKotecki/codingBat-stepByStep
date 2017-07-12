public boolean lastDigit(int a, int b) {
  int newA = a % 10;
  int newB = b % 10;
  if (newA == newB){
    return true;
    
  }
  return false;
}