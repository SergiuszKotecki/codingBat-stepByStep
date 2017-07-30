public String fizzString(String str) {
  char fizz = 'f';
  char buzz = 'b';
  
  if (str.charAt(0) == fizz && str.charAt(str.length()-1) == buzz    ){
    return "FizzBuzz";
  }else   if (str.charAt(0) == fizz) {
    return "Fizz";
  } else if (str.charAt(str.length()-1) == buzz){
    return "Buzz";
  }else 
  return str;
}
