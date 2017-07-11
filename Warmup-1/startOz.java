public String startOz(String str) {
  
   if (str.length()>1 && str.substring(0,2).contains("oz")){
     return "oz";
   } else if (str.length()>1 && str.substring(1,2).contains("z")){
     return "z";
   } else if (str.length()>0 && str.substring(0,1).contains("o")){
     return "o";
   }
  
  
  return "";
}
