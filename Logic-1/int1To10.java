public boolean in1To10(int n, boolean outsideMode) {
  
  if (!outsideMode && (n>0 && n<11)){
    return true;
  }else if (outsideMode && (n<=1 || n >= 10) ){
    return true;
  }
  return false;
  
}
