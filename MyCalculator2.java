//Author : KUNAL AWASTHI
//Platform : Eclipse_Neon.
//OS : Linux 16.10 Ubuntu_Gnome.
								/*Source Code*/

import java.util.Scanner;

public class Calculator2 {
	static String Loop() {
		String Loopyn = "";
		System.out.println("Do you want to continue....Y/N");
		Scanner Loop = new Scanner(System.in);
		if (Loop.nextLine() == "Y") {
			Loopyn = "y";
		}
		return Loopyn;
	}

	public static void main(String args[]) {
		long Input_A = 0;
		long Input_B = 0;
		long Result = 0;
		int Input_Loop = 0;
		int loop = 1;

		do {
			while (Input_Loop == 0) {
				Scanner InputA = new Scanner(System.in);
				System.out.println("Enter Inputs...");
				Input_A = InputA.nextInt();
				Scanner Input_Op = new Scanner(System.in);
				switch (Input_Op.nextLine()) {
				case "*":
					Scanner InputB1 = new Scanner(System.in);
					Input_B = InputB1.nextInt();
					Result = Input_A * Input_B;
					Input_Loop = 1;
					break;
				case "+":
					Scanner InputB2 = new Scanner(System.in);
					Input_B = InputB2.nextInt();
					Result = Input_A + Input_B;
					Input_Loop = 1;
					break;
				case "-":
					Scanner InputB3 = new Scanner(System.in);
					Input_B = InputB3.nextInt();
					Result = Input_A - Input_B;
					Input_Loop = 1;
					break;
				case "/":
					Scanner InputB4 = new Scanner(System.in);
					Input_B = InputB4.nextInt();
					Result = Input_A / Input_B;
					Input_Loop = 1;
					break;
				case "%":
					Scanner InputB5 = new Scanner(System.in);
					Input_B = InputB5.nextInt();
					Result = Input_A % Input_B;
					Input_Loop = 1;
					break;
				default:
					System.out.println("Please try again...");

				}
			}
			System.out.println(Result);
			String yn = Loop();
			if (yn == "\nY") {
				loop = 1;
				Input_Loop = 0;
			} else {
				loop = 0;
				Input_Loop = 1;
			}
		} while (loop == 1);
	}
}
