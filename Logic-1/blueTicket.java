public int blueTicket(int a, int b, int c) {
  int sumAB = a + b;
  int sumBC = b +c;
  int sumAC = a + c;
  int checkABC = sumAB-sumBC;
  int checkABAC = sumAB-sumAC;
  
  if (sumAB == 10 || sumBC == 10 || sumAC == 10){
    return 10;
  }if (checkABC == 10  || checkABAC == 10) {
    return 5;
  }else    
  return 0;
  
}
