package ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		int noodleCup = 0;

		noodleCup = 850;

		System.out.println("육개장 가격 : " + noodleCup);

		// 세개 가격 계산
		int sum = 0;
		sum = noodleCup * 3;
		System.out.println("육개장 3개의 가격 : " + sum);

		// 가격 상승
		noodleCup = 950;

		sum = noodleCup * 3;
		System.out.println("육개장 가격 : " + noodleCup + ", 3개의 가격 : " + sum);
		
		System.out.print("육개장 가격 : " + noodleCup);
		System.out.println(", 3개의 가격 : " + sum);

	}

}
