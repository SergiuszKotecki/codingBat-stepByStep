public boolean shareDigit(int a, int b) {
  
  int divA = a/10;
  int divB = b/10;
  int modA = a%10;
  int modB = b%10;
  
  return divA == divB || divA == modB || modA == divB || modA == modB;
}
