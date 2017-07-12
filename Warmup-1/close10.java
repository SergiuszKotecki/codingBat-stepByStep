public int close10(int a, int b) {
  int resultA =Math.abs( a - 10);
  int resultB =Math.abs( b - 10);
  if (resultA == resultB){
    return 0;
  } else if (resultA< resultB){
    return a;
  }else
  return b;
}
