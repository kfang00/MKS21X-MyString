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

  public int compareTo(CharSequence o) {
    int len = 0;
    if (o == null) {
      throw new NullPointerException(); //if the specified object is null
    }
    else {
      if (o.length() > length()) {
	len = length();
      }
      else {
	len = o.length(); //so I don't go out of bounds
      }
      for (int a = 0; a < len; a++) {
        if (o.charAt(a) != (charAt(a))) {
	  if ((o.charAt(a) - 0) > (charAt(a) - 0)) {// like a dictionary
	    return -1;
	  }
	  else {
	    return 1; //Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object.
	  }
        }
      }
      if (o.length() > length()) { // in case there are cases like hell compared to hello
	return -1;
      }
      else if (o.length() < length()) {
	return 1;
      }
      else {
	return 0;
      }
    }
  }
}
