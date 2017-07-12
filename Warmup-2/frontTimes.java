public String frontTimes(String str, int n) {
  if (str.length()>2){
    str = str.substring(0,3);
    return String.join("", Collections.nCopies(n, str));
  }
    return String.join("", Collections.nCopies(n, str));
}
