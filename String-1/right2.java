public String right2(String str) {
  String leftSide = str.substring(str.length()-2);
  String rigthSide = str.substring(0,str.length()-2);
  return leftSide + rigthSide;
}