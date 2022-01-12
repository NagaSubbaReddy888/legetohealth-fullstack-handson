

public class ConditionalOperators {
public static void main(String[] args) {
	int petrol = 100;
	if (petrol>100){
		System.out.println("price is very high");
	}
	else if(petrol==100) {
		System.out.println("Price is high");
	}
	else if(petrol<100 && petrol>80) {
		System.out.println("price is moderate");
	}
	else if(petrol<80 && petrol>60) {
		System.out.println("price is low");
	}
}
}
