public String extraEnd(String str) {
  String copyLastTwo = str.substring(str.length()-2);
  return copyLastTwo + copyLastTwo + copyLastTwo;
}