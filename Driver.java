public class Driver {
	public static void main(String[] args) {
		MyString b,d;
		String a,c;

		// A list of test cases. Add anything to this list, and it will run through a complete test case on that MyString.
		String[] cases = {
			"",
			"mario",
			"luigi",
			"qwertyuiopasdfghjklzxcvbnm",
			"helpimtrappedinastringfactory"
		};
		// For compareTo(), every string will be compared to every other String (in both directions).

		for (int i = 0; i < cases.length; i++) {
			a = cases[i];
		// Testing Constructor / MyString.toString()
			try {
				b = new MyString(a);
				if (!a.equals(b.toString())) {
						System.out.println("Error in Constructor / toString():");
						System.out.println("\tInput:       \""+a+"\"");
						System.out.println("\tYour result: \""+b+"\"");
						return;
				}
			} catch (Exception e) {
				System.out.println("Unwanted Exception in Constructor:");
				System.out.println("\tInput: \""+a+"\"");
				System.out.println("\nStack Trace:\n");
				e.printStackTrace();
				return;
			}
		// Testing MyString.length()
			if (b.length() != a.length()) {
					System.out.println("Error in length():");
					System.out.println("\tInput:          \""+b+"\"");
					System.out.println("\tDesired result: "+a.length());
					System.out.println("\tYour result:    "+b.length());
					return;
			}
		}
		System.out.println("Your code passed every test. Well done!");
	}
}