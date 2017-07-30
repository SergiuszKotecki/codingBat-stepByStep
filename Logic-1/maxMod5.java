public int maxMod5(int a, int b) {
  
  int divA = a%5;
  int divB = b%5;
  
  if (a == b){
    return 0;
  }
  
  if (divA==divB ){
    if (a>b){
      return b;
    }
    return a;
  }
  
  if (a>b) {
    return a;
  }
    return b;
}
