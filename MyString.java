public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    if (s.length() > 0) {
      for (int a = 0; a < s.length(); a++) {
        data[a] = s.charAt(a); //converting to an array of characters
      }
    }
  }

  public char charAt(int index) {
    if ((index < 0) || (index > (length() - 1))) {
      throw new IndexOutOfBoundsException(); //if the index argument is negative or not less than length()
    }
    else {
      return data[index]; //Returns the char value at the specified index
    }
  }

  public int length() {
    return data.length; //Returns the length of character sequence
  }

  public CharSequence subSequence(int start, int end) {
    String sub = "";
    if ((start < 0) || (end < 0) || (end > length()) || (start > end)) {
      throw new IndexOutOfBoundsException(); //if start or end are negative, if end is greater than length(), or if start is greater than end
    }
    for (int a = start; a < end; a++) {
      sub = sub + data[a];
    }
    return sub; //Returns a CharSequence that is a subsequence of this sequence 
		//The subsequence starts with the char value at the specified index and ends with the char value at index end - 1
  }

  public String toString() {
    String str = "";
    if (length() > 0) {
      for (int a = 0; a < length(); a++) {
        str = str + data[a];
      }
    }
    return str; //Returns a string containing the characters in this sequence in the same order as this sequence
  }

  public int compareTo(T o) {
    int compare = 0;
    if (o.length() == length()) {
      for (int a = 0; a < length(); a++) {
        if (!o.charAt(a).equals(data.charAt(a))) {
	  if ((o.charAt(a) - 0) > (data.charAt(a) - 0)) {
	    return -1;
	  }
	  else {
	    return 1;
	  }
	}
	return 0;
      }
    }
    else {
      if (o.length() > length()) {
	return -1;
      }
      else {
	return 1;
      }
    }
  }

}
