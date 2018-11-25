public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    for (int a = 0; a < s.length(); a++) {
      data[a] = s.charAt(a);
    }
  }

  public char charAt(int index) {
    return data[index];
  }

  public int length() {
    return data.length;
  }

  public CharSequence subSequence(int start, int end) {
    CharSequence sub = new CharSequence();
    for (int a = start; a < end; a++) {
      sub[a] = data[a];
    }
    return sub;
  }

  public String toString() {

  }


}
