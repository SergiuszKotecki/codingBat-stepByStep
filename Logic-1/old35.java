public boolean old35(int n) {
 if (n % 3 == 0 && n % 5 != 0){
    return true;
  } else if (n % 3 != 0 && n % 5 == 0){
    return true;
  } else
  return false;
}
