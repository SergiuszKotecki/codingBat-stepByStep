public String alarmClock(int day, boolean vacation) {
  
  if (!vacation && (day == 0 || day == 6)){
    return "10:00";
  } else if (!vacation && (day != 0 || day != 6)) {
    return "7:00";
  }else if (vacation && (day == 0 || day == 6)){
    return "off";
  } else if (vacation && (day != 0 || day != 6)) {
    return "10:00";
  }
  return "say what?!";
  
}
