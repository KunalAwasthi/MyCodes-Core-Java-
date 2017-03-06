
// Author : KUNAL AWASTHI.
//Platform : Eclipse IDE(Java Plug-in).
//OS System : Linux 16.10 Ubuntu_Gnome.
//Calculator Version 3.0(With Function-Calling Approach And Exception Handling).
/*-------------------------------------Source Code--------------------------------------*/

import java.util.Scanner; //import Scanner Class.

public class calculator3 {
	long InputA = 0, InputB = 0; // Input Variables..
	long Result = 0; // Output Variable..
	String Op = ""; // Operator String..
	String L = "\nY"; // Input String for main method loop..

	// Function for inputing A and B....
	public void GetInput() {
		System.out.println(" MyCalculator3.0..");
		System.out.println(" Enter Inputs...");
		try {
			Scanner Input_A = new Scanner(System.in);
			InputA = Input_A.nextLong();
			System.out.println("OP");
			getOp();
			Scanner Input_B = new Scanner(System.in);
			InputB = Input_B.nextLong();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {

		}
	}

	// Function for getting Arithmetic Operator
	public void getOp() {
		Scanner InputOp = new Scanner(System.in);

		switch (InputOp.nextLine()) {
		case "*":
			Op = "\n*";
			break;
		case "+":
			Op = "\n+";
			break;
		case "-":
			Op = "\n-";
			break;
		case "/":
			Op = "\n/";
			break;
		case "%":
			Op = "\n%";
			break;
		default:
			System.out.println("Please Enter a valid Operator..");
			this.getOp();
			break;
		}
	}

	// Function for Result
	public void getResult() {
		try {
			if (Op != "" & InputA != 0 & InputB != 0) {
				if (Op == "\n*") {
					Result = InputA * InputB;
				} else if (Op == "\n+") {
					Result = InputA + InputB;
				} else if (Op == "\n-") {
					Result = InputA - InputB;
				} else if (Op == "\n%") {
					Result = InputA % InputB;
				} else if (Op == "\n/") {
					Result = InputA / InputB;
				} else {
					System.out.println("Please try again..");
					GetInput();
				}
			}
		} catch (ArithmeticException e2) {
			System.out.println("ERROR : " + e2);
		} finally {

		}
		System.out.println("Result...\n" + Result);	
	}

	// Function
	public void Loop() {
		System.out.print("you want to continue...");
		System.out.println("Enter 1 to continue...Enter 0 to terminate...");
		Scanner LoopI = new Scanner(System.in);
		if (LoopI.nextInt() == 0) {
			this.L = "";
			LoopI.close();
		}
	}

	// Main method starts here 
	public static void main(String args[]) {

		calculator3 C3 = new calculator3();
		while (C3.L == "\nY") {
			C3.GetInput();
			C3.getResult();
			C3.Loop();
		}
	}
}
