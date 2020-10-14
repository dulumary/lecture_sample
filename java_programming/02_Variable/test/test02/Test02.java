package test02;

public class Test02 {

	public static void main(String[] args) {
		/*
		 * 시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다. 시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		 */

		int score = 0;
		char gradeChar = 0;
		double gradeDouble = 0.0;

		score = 90;
		gradeChar = 'A';
		gradeDouble = 4.0;

		System.out.println("시험 성적이 " + score + " 이상이면 " + gradeChar +  ", 평점은 " + gradeDouble +  " 입니다");

		score = 80;
		gradeChar = 'B';
		gradeDouble = 3.0;

		System.out.println("시험 성적이 " + score + " 이상이면 " + gradeChar +  ", 평점은 " + gradeDouble +  " 입니다");

		/*
		 * 아래 정수와 실수를 곱해서 출력하세요
		 */

		int number1 = 33;
		double number2 = 35.325;

		System.out.println("두 수의 곱 : " + (number1 * number2));

		/*
		 * 943 시간은 몇일 인지 구하여 출력하세요.
		 */

		int hour = 943;
		System.out.println(hour + " 시간은 " + hour / 24 + "일 입니다.");

		/*
		 * 가로 길이 8 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하세요. 넓이는 직접 계산하지 말고, 컴퓨터에게 양보하세요. 
		 * 출력 : 사각형의 넓이 : ?? 삼각형의 넓이 : ??
		 */

		int width = 8;
		int height = 9;

		int rectangleArea = width * height;
		System.out.println("사각형 넓이 : " + rectangleArea);

		width = 8;
		height = 9;

		double triangleArea = width * height / 2.0;
		System.out.println("삼각형의 넓이 : " + triangleArea);

		/*
		 * 국어 93점, 수학 88, 영어 94점 평균 : ??.
		 */

		int koreanScore = 93;
		int mathScore = 88;
		int englishScore = 94;

		double average = (koreanScore + mathScore + englishScore) / 3.0;

		System.out.println("국어 " + koreanScore + "점, 수학 " + mathScore + "점, 영어 " + englishScore + "점");
		System.out.println("평균 : " + average);

		/*
		 * 아래 공식을 이용해서 섭시 30도의 화씨 온도를 출력하세요.
		 * 
		 * 화씨 온도 = 9 / 5 * 섭씨온도 + 32
		 */

		int fahrenheit = 9 / 5 * 30 + 32;
		
		System.out.println("섭씨 30도는 화씨 " + fahrenheit + "도 입니다.");

	}

}
