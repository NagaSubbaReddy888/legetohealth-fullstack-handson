import java.util.Scanner;

public class LargestNumber {
public static void main(String[] args) {
	int a,b,c,largest,d;
	@SuppressWarnings("resource")
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the first number");
	a= sc.nextInt();
	System.out.println("Enter the second number");
	b=sc.nextInt();
	System.out.println("Enter the third number");
	c=sc.nextInt();
	d=a>b?a:b;
	largest=c>d?c:d;
	System.out.println("The largest number is:"+largest);
}

}
