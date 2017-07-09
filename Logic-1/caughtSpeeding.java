public int caughtSpeeding(int speed, boolean isBirthday) {
  if (isBirthday){
    speed = speed - 5;
  }
  if (speed >=81) {
    return 2;
  }else if (speed <81 && speed >60){
    return 1;
  } else return 0;
  
}
