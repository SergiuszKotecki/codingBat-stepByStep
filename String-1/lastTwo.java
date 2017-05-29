public String lastTwo(String str) {
  if (str.length()>=2){
     String lastChar = str.substring(str.length()-1);
  String penultimateChar = str.substring(str.length()-2,str.length()-1);
  String basicString = str.substring(0, str.length()-2);
  return basicString +  lastChar + penultimateChar;
  } else if (str.length() == 1) {
    return str;
  }
  return "";
}