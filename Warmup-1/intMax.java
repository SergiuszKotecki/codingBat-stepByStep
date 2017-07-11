public int intMax(int a, int b, int c) {
  int max = 0;
  if (a > b){
    max = a;
  }else {
    max = b;
  }
  
  if (max > c){
    return max;
  }return c;
}
