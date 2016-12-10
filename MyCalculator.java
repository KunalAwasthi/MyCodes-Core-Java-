//Author : Kunal Awasthi
//Platform : Eclipse_Neon.
//OS : Linux 16.10 Ubuntu_Gnome.
								/*Source Code*/
import java.util.Scanner; //import Scanner Class.

class MyCalculator {// Class starts here.
	public static void main(String args[]) {// MainBody Starts Here.
		int Selector = 0;
		long Result = 0;
		long a = 0, b = 0; // input A and B.
		int m = 0; // Flag for while loop.
		System.out.println("Enter the value of a and press enter after inputting operants and operator");
		Scanner s = new Scanner(System.in); // Scanner for input A.
		a = s.nextLong();
		Scanner s1 = new Scanner(System.in); // Scanner for Arithmetic Operator.
		/* While Loop starts here */
		while (m == 0) {
			switch (s1.nextLine()) {
			case "/":
				Selector = 1;
				m = 1;
				break;
			case "+":
				Selector = 2;
				m = 1;
				break;
			case "*":
				Selector = 3;
				m = 1;
				break;
			case "-":
				Selector = 4;
				m = 1;
				break;
			case "%":
				Selector = 5;
				m = 1;
				break;
			default:
				System.out.println("Please Try again");
				System.exit(0);
			}
			/* While Loop Ends */
		}
		Scanner s2 = new Scanner(System.in); // Scanner for input B.
		b = s2.nextLong();
		/* if-else-if start */
		if (Selector == 1) {
			Result = a / b;
		} else if (Selector == 2) {
			Result = a + b;
		} else if (Selector == 3) {
			Result = a * b;
		} else if (Selector == 4) {
			Result = a - b;
		} else if (Selector == 5) {
			Result = a % b;
		}
		/* if-else-if Ends */
		/* Result */
		System.out.print(Result);
		/* Result */

		/* Close all leaking Scanner */
		s.close();
		s1.close();
		s2.close();
	}// MainBody Ends.
}// ClassBody Calculator Ends.
								/*Source Code*/
