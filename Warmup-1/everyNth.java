public String everyNth(String str, int n) {
  String everyNth = "";
  int start = 0;
  for (int i=0; i<str.length(); i= i + n){
    everyNth = everyNth + str.charAt(i);
    
  }
  
  return everyNth;
  
}
