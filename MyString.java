public class MyString implements CharSequence{
  private char[] data;
  public MyString(CharSequence s){
    for (int a = 0; a < s.length(); a++) {
      data[a] = s.charAt(a);
    }
  }

  public char charAt(int index) {
    if ((index < 0) || (index > (data.length - 1))) {
      throw new IndexOutOfBoundsException();
    }
    else {
      return data[index];
    }
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end) {
    String sub = "";
    if ((start < 0) || (end < 0) || (end > data.length) || (start > end)) {
      throw new IndexOutOfBoundsException();
    }
    for (int a = start; a < end; a++) {
      sub = sub + data[a];
    }
    return sub;
  }

  public String toString() {
    String str = "";
    for (int a = 0; a < data.length; a++) {
      str = str + data[a];
    }
    return str;
  }


}
