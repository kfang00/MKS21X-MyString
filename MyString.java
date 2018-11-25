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

  }

  public String toString() {

  }


}
