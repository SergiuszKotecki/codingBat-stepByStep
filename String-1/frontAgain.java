public boolean frontAgain(String str) {
    return str.length() > 1 && (str.substring(0,2).equals(str.substring(str.length()-2)));
  
}
