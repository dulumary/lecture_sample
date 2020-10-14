package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		/*
        	두 수를 입력 받아서 덧셈 뺄셈 곱하기 나누기한 결과를 출력하세요
		 */
    
		int number1 = 0;
		int number2 = 0;

		System.out.print("입력1 : ");
		number1 = scan.nextInt();
		System.out.print("입력2 : ");
		number2 = scan.nextInt();

		System.out.println("덧셈 : " + (number1 + number2));
		System.out.println("뺄셈 : " + (number1 - number2));
		System.out.println("곱셈 : " + (number1 * number2));
		System.out.println("나눗셈 : " + (number1 / number2));


		/*
        	두 수를 입력 받아서 몫과 나머지를 출력하세요.
		 */

		number1 = 0;
		number2 = 0;

		System.out.print("입력1 : ");
		number1 = scan.nextInt();
		System.out.print("입력2 : ");
		number2 = scan.nextInt();

		System.out.println("몫 : " + number1 / number2);
		System.out.println("나머지 : " + number1 % number2);


		/*
        	입력 받은 숫자의 값을 한 변의 길이로 하는 가진 정사각형의 넓이를 구하여 출력하세요
     	*/
    
		int length = 0;
		System.out.print("길이 : ");
		length = scan.nextInt();
    
		int result = length * length;
    
		System.out.println("정사각형의 넓이 : " + result);
    
		/*
        	밑변 과 높이를 입력 받아서 삼각형의 넓이를 구하여 출력하세요.
		 */
    
		int width = 0;
		int height = 0;
    
		System.out.print("밑변 : ");
		width = scan.nextInt();
		System.out.print("높이 : ");
		height = scan.nextInt();
    
		double area = width * height / 2.0;
    
		System.out.println("삼각형의 넓이 : " + area);
    
		/*
			수 두개를 x, y 에 입력 받아서 바꿔서 출력하세요.
		 */
    
		int x = 0;
		int y = 0;
    
		System.out.print("x : ");
		x = scan.nextInt();
		System.out.print("y : ");
		y = scan.nextInt();
    
		int tmp = x;
		x = y;
		y = tmp;
    
		System.out.println("x : " + x + " y : " + y);
    
		/*
        	초를 입력 받아서 ?분?초 형태로 출력 하시오.
		 */
    
		int seconds = 0;
		System.out.print("초 : ");
		seconds = scan.nextInt();
    
		int minute = seconds / 60;
		seconds = seconds % 60;
    
		System.out.println(minute + "분 " + seconds + "초");
		
		scan.close();
	}

}
