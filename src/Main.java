
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Geekation");
	}
	
	//条件分岐
//	package basicSyntax;
//
//	public class IfSwitch {
//
//		public static void main(String[] args) {
//			int num = 2;
//
//			if (num % 2 == 0) {
//				System.out.println("2の倍数です。");
//			}   else  if (num % 3 == 0) {
//				System.out.println("3の倍数です。");
//			}   else {
//				System.out.println("どちらでもありません。");
//			}
//
//			String pref = "沖縄";
//
//			switch (pref) {
//				case "北海":
//					 System.out.println("北海道");
//				     break;
//				case "東京":
//					 System.out.println("東京都");
//					 break;
//				case "京都":
//					 System.out.println("京都府");
//					 break;
//				default:
//					 System.out.println("当てはまりません。");
//					 break;	
//
//			}
//
//		}
//
//	}
	
	
	//繰り返し処理
//	package basicSyntax;
//
//	public class ForWhile {
//
//		public static void main(String[] args) {
//			for (int num = 1; num <= 100; num++) {
//				if (num % 3 == 0 && num % 5 == 0) {
//					System.out.println("FizzBuzz");
//				} else if (num % 3 == 0) {
//					System.out.println("Fizz");
//				} else if (num % 5 == 0) {
//					System.out.println("Buzz");
//				} else {
//					System.out.println(num);
//				}
//			}
//
//			String [] languages = {"Ruby", "Golang", "Java", "Python", "Typescript", "HTML", "Javascript"};
//
//			for (String language: languages) {
//				if (language.equals("Java")) {
//					System.out.println("現在学習中の言語はJavaです。");
//					continue;
//				}
//
//				if (language.equals("HTML")) {
//					System.out.println("HTMLはプログラミング言語ではありません。");
//					break;
//				}
//
//				System.out.println(language);
//			}
//
//		}
//
//	}
	
	//メソッド
//	package basicSyntax;
//
//	public class MethodPractice {
//
//		public static void main(String[] args) {
//			int a = 30;
//			int b = 15;
//
//			int sum = add(a, b);
//			int diff = subtract(a, b);
//			int product = multiply(a, b);
//			int quotient = divide(a, b);
//
//			printResult(sum);
//			printResult(diff);
//			printResult(product);
//			printResult(quotient);
//		}
//
//		public static int add(int x, int y) {
//			return x + y;
//		}
//
//		public static int subtract(int x, int y) {
//			return x - y;
//		}
//
//		public static int multiply(int x, int y) {
//			return x * y;
//		}
//
//		public static int divide(int x, int y) {
//			return x / y;
//		}
//
//		public static void printResult(int result) {
//			System.out.println("計算結果は" + result + "です。");
//		}
//
//	}
//	
	//クラス
//	package basicSyntax;
//
//	public class GeekIntroduction {
//
//		public void greeting(int age, double height) {
//			System.out.println("こんにちは! 私はGeek君でごわす。");
//			System.out.println("年は" + age + "でごわす。");
//			System.out.println("身長は" + height + "でごわす。");
//		}
//
//		public void specialSkill(int num1, int num2) {
//			if (num1 < 1 || num2 < 1) {
//				System.out.println("num1とnum2は0より大きい値にしてください。");
//				return;
//			}
//			if (num1 >= num2) {
//				System.out.println("num2はnum1より大きい値にしてください。");
//				return;
//			}
//			if (num1 > 300 || num2 > 300) {
//				System.out.println("num1とnum2は300以下にしてください。");
//				return;
//			}
//
//			for (int count = num1; count <= num2; count++) {
//				if (count % 3 == 0 && count % 5 == 0) {
//					System.out.println(count + "は3の倍数かつ5の倍数です。");
//					continue;
//				}
//				if (count % 3 == 0) {
//					System.out.println(count + "は3の倍数です。");
//					continue;
//				}
//				if (count % 5 == 0) {
//					System.out.println(count + "は5の倍数です。");
//					continue;
//				}
//				System.out.println(count);
//			}
//		}
//	}
//	
	//クラスのmain
//	package basicSyntax;
//
//	public class Main {
//	  public static void main(String[] args) {
//		 GeekIntroduction geek = new GeekIntroduction();
//
//		 int age = 24;
//		 double height = 170.1;
//		 geek.greeting(age, height);
//
//		 int num1 = 10;
//		 int num2 = 40;
//		 geek.specialSkill(num1, num2);
//
//		}
//	}

}
