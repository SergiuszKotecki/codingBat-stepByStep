public String missingChar(String str, int n) {
  return str.substring(0,n) + str.substring(n+1,str.length());
  //or
  //String frontPart = str.substring(0,n);
  // String lastPart = str.substring(n+1,str.length());
  // return frontPart + lastPart;
}
