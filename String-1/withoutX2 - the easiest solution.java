public String withoutX2(String str) {
  
  if (str.length()>1){
  return str.substring(0,2).replace("x", "") + str.substring(2);
  }
  return "";
}
