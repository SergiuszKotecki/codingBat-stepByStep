boolean doubleX(String str) {
 int doubleX = str.indexOf('x');
 if (doubleX == -1 || doubleX+1 >=str.length()){
   return false;
 }
  
  if (str.substring(doubleX, doubleX+2).equals("xx")){
    return true;
  }return false;
}
