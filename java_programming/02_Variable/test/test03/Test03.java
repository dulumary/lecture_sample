package test03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
        	나이를 입력 받아서 아래와 같이 출력하세요.
        	이름 : 김인규 나이 : 24
		 */
		
    
		int age = 0;
		System.out.println("나이를 입력하세요");
		age = scan.nextInt();
		System.out.println("이름 : 김인규 나이 : " + age);
    
    
		/*
        	두 수를 입력 받아서 더하고 아래와 같이 출력하세요.
        	3 + 5 = 8
     	*/
    
		int number1 = 0;
		int number2 = 0;
		int sum = 0;
    
		System.out.println("두 수를 입력하세요");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
    
		sum = number1 + number2;
		System.out.println(number1 + " + " + number2 + " = " + sum);
    
		/*
        	두 수를 입력 받아서 뻬고 아래와 같이 출력하세요.
        	3 - 5 = -2;
		 */
    
		System.out.println("두 수를 입력하세요");
		number1 = scan.nextInt();
		number2 = scan.nextInt();
    
		System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
    
  
		/*
        	단수를 입력 받고 아래와 같이 출력하세요.
        	5 X 1 = 5
        	5 X 2 = 10
        	5 X 3 = 15
        	5 X 4 = 20
        	5 X 5 = 25
     	*/
    
		System.out.print("단수를 입력하세요 : ");
		number1 = scan.nextInt();
    
		System.out.println(number1 + " X 1 = " + number1 * 1);
		System.out.println(number1 + " X 2 = " + number1 * 2);
		System.out.println(number1 + " X 3 = " + number1 * 3);
		System.out.println(number1 + " X 4 = " + number1 * 4);
		System.out.println(number1 + " X 5 = " + number1 * 5);
    
		/*
        	지름을 입력 받아서 원의 넓이를 구하여 출력하세요.
		 */
    
		System.out.print("지름을 입력하세요 : ");
		number1 = scan.nextInt();
		double area = (number1 / 2.0) * (number1 / 2.0) * Math.PI;
    
		System.out.println("원의 넓이 : " + area);
		
		scan.close();

	}

}
