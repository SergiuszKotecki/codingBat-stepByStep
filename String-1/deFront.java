public String deFront(String str) {    
  String lastChars = str.substring(2);
  if (str.substring(0,1).equals("a") && str.substring(1,2).equals("b") ){
    return str;
  }else if (str.substring(0,1).equals("a")){
    return "a" + lastChars;
  }else   if (str.substring(1,2).equals("b")){
    return "b" + lastChars;
  }  else  
  return lastChars;
}