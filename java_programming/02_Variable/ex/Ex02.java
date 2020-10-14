package ex02;

public class Ex02 {

	public static void main(String[] args) {
		
	    int noodleCup = 850;
	    double pi = 3.14;
	    char quiz = 'O';
	    
	    System.out.println("육개장 가격 : " + noodleCup);
	    System.out.println("원주율 pi " +  pi);
	    System.out.println("퀴즈의 정답 : " + quiz);
	    
	    pi = 3.14;
	    int intPi = (int)pi;
	    System.out.println("int pi : " + intPi);
	    
	    pi = (double)intPi;
	    System.out.println("float pi : "+ pi);
	    
	    double divide = intPi / 2;
	    System.out.println("나눈 값 : "+ divide);
	    
	    divide = intPi / (float)2;
	    System.out.println("나눈 값 : "+ divide);
	    
	    divide = intPi / 2.0;
	    System.out.println("나눈 값 : "+ divide);
	}

}
