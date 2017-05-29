public boolean nearHundred(int n) {
  return ( (n>=90 && n<=110) || (n>=190 && n<=210));
  //or 
  //return ((Math.abs(200 - n) <= 10) || (Math.abs(100 - n) <= 10));
}
