package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		
		boolean isGreaterA = (a > b);
		boolean isGreaterB = (a < b);
		
		boolean isSunny = true;
	    boolean isWarm = true;
	    
	    boolean andResultA = (isSunny && isWarm);
	    boolean andResultB = (isSunny && !isWarm);
	    
	    int x = 30;
		int y = 50;
		
		boolean result = (x >= 0 && y % 2 == 0);
		
		boolean hasPermission = false;
		
		boolean notResult = !hasPermission;
		
		System.out.println(isGreaterA);
		System.out.println(andResultA);
		System.out.println(result);
		System.out.println(notResult);
		

	}

}
