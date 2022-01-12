

public class Operators {
public static void main(String[] args) {
	int x = 50;
	int y = ++x;
	int z = x++;
	System.out.println("X="+x+",Y="+y+",Z="+z);
	int a = 40;
	int b = +a;
	int c = a++;
	System.out.println("A="+a+",B="+b+",C="+c);
	boolean status = x>a;
	System.out.println("Status "+status);
	status = x<a;
    System.out.println("Status "+status);
}
}
