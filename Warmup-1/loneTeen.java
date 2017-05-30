public boolean loneTeen(int a, int b) {
  boolean aSample = (a >= 13 && a <= 19);
  boolean bSample = (b >= 13 && b <= 19);
  
  return (aSample && !bSample) || (!aSample && bSample);
  /*
  if ((a>=13 && a<=19) || (a>=13 && a<=19)){
    return true;
  }else if ((a>=13 && a<=19) && (a>=13 && a<=19)){
    return false;
  } 
  return false;
  */

}
