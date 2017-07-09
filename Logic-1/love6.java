public boolean love6(int a, int b) {
    //a = Math.abs(a);
    //b = Math.abs(b);
    int sumAB = a + b;
    int diffAB = a - b;
    int diffBA = b - a;
    if ( a == 6 || b == 6 || sumAB == 6 || diffAB == 6 || diffBA == 6){
      return true;
    }else 
    return false;
}
