package Calculator;

import java.util.Scanner;

public class Calcodes {

			public static void main(String[] args) {
				while (true) {
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the first number");
					int num1 = sc.nextInt();
					System.out.println("Enter the second number");
					int num2 = sc.nextInt();
			
					Calfunction calc = new Calfunction();
					int result = calc.add(num1, num2);
					System.out.println("Answer "+ result);
					int result1 = calc.sub(num1, num2);
					System.out.println("Answer "+ result1);
					int result2 = calc.mult(num1, num2);
					System.out.println("Answer "+ result2);
					int result3 = calc.div(num1, num2);
					System.out.println("Answer "+ result3);
							
				}
			}
			
}
			
