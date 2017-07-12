public String endUp(String str) {
  if (str.length()>2){
    String newString = str.substring(0,str.length()-3) + str.substring(str.length()-3).toUpperCase();
  return   newString;
  }else
  return str.toUpperCase();
  
}
