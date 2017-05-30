public String front22(String str) {
  String front22;
  
  if (str.length()>=2){
    front22 = str.substring(0,2) + str + str.substring(0,2) ;
    return  front22;
  }else
  front22 = str + str + str;
  return front22;

}
