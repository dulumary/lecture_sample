package test05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

	    /*
	        네 자리수 숫자를 입력 받아서 천의 자리부터 한줄씩 출력 하세요.
	     */
	    
	    int number = 0;
	    System.out.println("네자리 수를 입력하세요");
	    number = scan.nextInt();
	    
	    System.out.println(number / 1000);
	    number %= 1000;
	    System.out.println(number / 100);
	    number %= 100;
	    System.out.println(number / 10);
	    number %= 10;
	    System.out.println(number);
	    
	    
	    /*
	        네자리수를 입력 받아서 일의 자리부터 한 줄씩 출력하세요.
	     */
	    
	    System.out.println("네자리 수를 입력하세요");
	    number = scan.nextInt();
	    
	    System.out.println(number % 10);
	    number /= 10;
	    System.out.println(number % 10);
	    number /= 10;
	    System.out.println(number % 10);
	    number /= 10;
	    System.out.println(number);
	    
	    /*
	        네 자리수를 입력 받아서 각 자리수의 합을 출력하세요.
	     */
	    
	    int sum = 0;
	    System.out.println("네자리 수를 입력하세요");
	    number = scan.nextInt();
	    
	    sum += number / 1000;
	    number %= 1000;
	    sum += number / 100;
	    number %= 100;
	    sum += number / 10;
	    number %= 10;
	    sum += number;
	    
	    System.out.println("합계 : " + sum);
	    
	    /*
	        세자리 수를 입력 받아서 역순으로 출력하세요.
	    */
	    
	    System.out.print("세자리 수를 입력하세요 : ");
	    number = scan.nextInt();
	    System.out.print(number % 10);
	    number /= 10;
	    System.out.print(number % 10);
	    number /= 10;
	    System.out.print(number % 10);
	    
	    scan.close();

	}

}
