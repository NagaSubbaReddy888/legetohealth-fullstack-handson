import java.util.Scanner;

public class KbInput {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter an int");
	int i=sc.nextInt();
	System.out.println("Enter a double");
	double d=sc.nextDouble();
	System.out.println("valus is"+(i+d));
	
}
}
