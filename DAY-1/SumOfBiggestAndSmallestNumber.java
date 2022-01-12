import java.util.Scanner;

public class SumOfBiggestAndSmallestNumber {

	public static void main(String[] args) {
	
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter First number: ");
				int first = sc.nextInt();

				System.out.println("Enter Second number: ");
				int second = sc.nextInt();

				System.out.println("Enter Third number: ");
				int third = sc.nextInt();

				int output = sum(first, second, third);
				System.out.println("Value  is  " + output);

				sc.close();
			}

			public static int sum(int a, int b, int c) {
				int smallest = 0;
				int largest = 0;

				if (a >= b && a >= c) {
					largest = a;
				} else if (b >= a && b >= c) {
					largest = b;
				} else if (c >= a && c >= b) {
					largest = c;
				}

				if (a < b && a < c) {
					smallest = a;
				} else if (b < c) {
					smallest = b;
				} else {
					smallest = c;
				}

				return largest + smallest;
			}
	}


