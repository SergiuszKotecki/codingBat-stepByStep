public String lastChars(String a, String b) {
 if (a.length()<1 ){
    a = "@";
  }
 if (b.length()<1){
    b = "@";
  }
  String firstA = a.substring(0,1);
  String lastB = b.substring(b.length()-1);
  return firstA + lastB;
}
