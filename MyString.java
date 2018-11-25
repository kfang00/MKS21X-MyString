public class MyString implements CharSequence{
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
      throw new IndexOutOfBoundsException();
    }
    else {
      return data[index];
    }
  }

  public int length() {
    return data.length; //Returns the length of character sequence
  }

  public CharSequence subSequence(int start, int end) {
    String sub = "";
    if ((start < 0) || (end < 0) || (end > length()) || (start > end)) {
      throw new IndexOutOfBoundsException();
    }
    for (int a = start; a < end; a++) {
      sub = sub + data[a];
    }
    return sub;
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


}
