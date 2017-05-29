public String atFirst(String str) {
  if(str.length()>=1){
  if (str.length()<2){
    return str.substring(0,1) +"@";
  }else
  return str.substring(0,2);
  }else
  return "@@";
}