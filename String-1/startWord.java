public String startWord(String str, String word) {
		if (word.length() > str.length()){
		return "";
		} 
        if (str.substring(0, word.length()).equals(word)){
          return word;
        } 
        if (str.substring(1, word.length()).equals(word.substring(1))){
          return str.charAt(0) + word.substring(1);
        }
            
        return "";
}
