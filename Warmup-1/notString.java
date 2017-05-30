public String notString(String str) {
  if (str.length()>2 && str.substring(0,3).equals("not")){
    return str;
  }
  return "not " + str;
}
