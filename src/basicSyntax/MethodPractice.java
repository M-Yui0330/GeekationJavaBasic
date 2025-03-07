package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		int a = 30;
		int b = 15;
		
		int sum = add(a, b);
		int diff = subtract(a, b);
		int product = multiply(a, b);
		int quotient = divide(a, b);
		
		printResult(sum);
		printResult(diff);
		printResult(product);
		printResult(quotient);
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int subtract(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}
	
	public static void printResult(int result) {
		System.out.println("計算結果は" + result + "です。");
	}

}
