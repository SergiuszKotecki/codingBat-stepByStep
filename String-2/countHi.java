public int countHi(String str) {
  int start = 0;
  int count = 0;
  while (true) {
    int found = str.indexOf("hi", start);
    if (found != -1) {
      count = count +1;
    }else if (found == -1){
      break;
    } 
    start = found + 1;  // move start up for next iteration
  
  }
  return count;
  
}