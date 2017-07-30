public boolean twoAsOne(int a, int b, int c) {
  if (a+b == c){
    return true;
  }else if (a+c == b){
    return true;
  }else if (b+c == a){
    return true;
  }
  return false;
}
