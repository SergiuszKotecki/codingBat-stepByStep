public int sortaSum(int a, int b) {
  int result = a  + b;
  int forbiddenResult = 20;
  if (result >= 10 && result <=19){
    return forbiddenResult;
  } else
  return result;
}
