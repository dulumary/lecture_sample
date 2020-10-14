package ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	    int noodleCup = 0;
	    
	    System.out.println("육개장 가격");
	    noodleCup = scan.nextInt();
	    
	    System.out.println("육개장 가격 : " + noodleCup);
	    
	    //  세개 가격 계산
	    int sum = 0;
	    sum = noodleCup * 3;
	    
	    System.out.println("육개장 3개의 가격 : " + sum);
	    
	    int count = 0;
	    System.out.println("육개장 가격");
	    noodleCup = scan.nextInt();
	    System.out.println("육개장 갯수");
	    count = scan.nextInt();
	    
	    System.out.print("육개장 가격 과 갯수 : ");
	    noodleCup = scan.nextInt();
	    count = scan.nextInt();
	    
	    sum = noodleCup * count;
	    
	    System.out.println("육개장 " + count + "개의 가격은 " + sum + "원");
	    
	    scan.close();

	}

}
