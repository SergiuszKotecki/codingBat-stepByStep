public boolean catDog(String str) {
  int startCat = 0;
  int startDog = 0;
  int countCats = 0;
  int countDogs = 0;
  
  //counting cats
  while (true) {
    int foundCat = str.indexOf("cat", startCat);
    if (foundCat != -1) {
      countCats = countCats +1;
    }else if (foundCat == -1){
      break;
    } 
    startCat = foundCat + 1;  // move start up for next iteration
  
  }
  
   //counting dogs
  while (true) {
    int foundDog = str.indexOf("dog", startDog);
    if (foundDog != -1) {
      countDogs = countDogs +1;
    }else if (foundDog == -1){
      break;
    } 
    startDog = foundDog + 1;  // move start up for next iteration
  }
  
  
  if (countDogs != countCats) {
    return false;
  }else
  return true;
  
  


}
