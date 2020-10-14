#  2. 변수    


## 값을 저장 하는 공간

```
육개장 가격은 850이다.
```

* 실 생활에서 육개장 가격이라는 문장에 850원을 입력한다. 
* 이와 같이 프로그래밍에서도 값을 저장 하고 라벨링 하기 위해서 변수를 사용한다. 


#### 육개장 가격을 저장하는 문장을 JAVA 문법으로 번역 하면 아래와 같다.

```
육개장 가격은 850이다.
       ▼
가격 육개장  = 850
       ▼
int noodleCup = 850;
```

## 변수 뜯어 보기 - int noodleCup = 850;
* int 는 type 을 의미한다. 
	*  type은 해당 변수에 어떤 형태의 값이 들어 오는지 정해준다. 
	*  **type**, **데이터 형**, **자료 형**이라고 한다. 
	*  int 는 Integer의 약자로  정수를 의미한다. 즉, 정수만 저장 가능한 변수임을 의미한다. 
	*  noodleCup 변수의 이름이다. 
*  noodleCup 은 변수의 이름이다. 
	* 변수 이름은 해당 변수의 의미에 맞게 지어준다. 
	* **변수명**이라고 한다. 
*  noodleCup = 850; 
	* 850 이라는 값을 변수 noodleCup 에 저장한다. 
	* **할당** 혹은 **asign** 이라고 한다. 
	* 이제 noodleCup은 850이라는 값을 부여 받는다.
	* 저장하는 값은 type과 일치하는 형태여야 하고 그렇지 않으면 에러가 발생한다. 
* [예제보기](ex/Ex01.java)
* [문제풀기](test/test01/README.md)

## 변수의 선언 - int noodleCup;
* 변수를 사용하기 위해서는 `int noodleCup;` 와 같은 형태로 **선언**을 한다. 
* 선언은  해당 변수를 사용하겠다고 하는 명시를 하는 것이다. 
* 선언은 _메모리 영역 내에 값을 저장 할 수 있는 공간을 확보_ 하라는 의미도 있다.
* type은 그 메모리 영역의 크기를 의미한다. 
* type 과 그에 따르는 메모리 크기  		 	
	
	|type|크기|범위|
	|:---:|:---:|:---:|
	|byte|1 byte|-128 ~ 127|
	|short|2 byte|-32,768 ~ 32,767|
	|int|4 byte|-2,147,483,648 ~ 2,147,483,647|
	|long|8 byte|-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807|
	|float|4 byte|1.4E-45 ~ 3.4028235E38|
	|double|8 byte|4.9E-324 ~ 1.7976931348623157E308|
	|boolean|1 bit|true, false|
	|char|2 byte|문자|

 * 변수 type 중  **int(정수), char(문자), double(소수)**   세 가지만 기억 하세요!
 * 나머지 type은 필요 할때 찾아서 사용하시면 됩니다!

## 변수명 규칙
### 절대 규칙 
* 알파벳, 숫자, _ 로만 구성 가능
* 숫자로 시작 할 수 없다
* 공백은 포함 될 수 없다
* [예약어](http://wiki.hash.kr/index.php/%EC%9E%90%EB%B0%94_%EC%98%88%EC%95%BD%EC%96%B4)는 사용할수 없다. 

### 가독성
* 명확한 뜻을 가진 단어를 이용한다 `ex) score, name, count, address`
* 축약어는 지양 ` ex) cnt, addr, num, no`
* 단어 조합 가능
	* 카멜 표현법 - 낙타의 봉처럼 단어 사이에 대문자를 사용한다. 
		* `ex) className, selectType`
	* 스네이크표현법 - 단어 사이에 _ 를 통해서 연결한다. 
		* `ex) class_name, select_type`	 

## 변수 출력 하기 - System.out.println("점수 : " + score);
* System.out.println("Hello, World!!");
	* 가장 일반적인 출력 방식 
	* 줄바꿈을 원하지 않으면 `System.out.print("Hello, World!!");`
	* 따옴표 안에 있는 내용을 그대로 출력
	
* System.out.println(score);	
	* 문장 대신에 변수를 그대로 넣으면 출력이 된다.
	* score = 95 일때   아래와 같이 출력

``` 
95
```
* System.out.println("점수 : " + score);
	* 변수와 함께 문장을 같이 출력할때는, 출력할 변수를 문장 뒤에 + 로 붙여 준다. 
	* + 연산은 단순한 숫자 연산 이외에도 다양하게 사용된다.
	* score = 95 일때   아래와 같이 출력
``` 
점수 : 95
```

* System.out.println(score + "점");
	* 변수가 먼저 오고 문장이 나중에 오는 경우도 가능하다. 
	* score = 95 일때   아래와 같이 출력
``` 
95점
```

*  System.out.println("국어 : " + korean + " 수학 : " + math + " 영어 : " + english); 
	* 위와 같이 문장과 변수가 여러개 일 경우 문장과 숫자를 모두 + 로 이어준다.
	* korean = 80; math = 73; english = 90; 일때 아래와 같이 출력된다. 

``` 
국어 : 80점 수학 : 73점 영어 : 90 입니다. 
```

## println 줄바꿈 - \n
```
System.out.println("안녕하세요. 만나서 반갑습니다.");
```
* 위와 같이 출력 했을 경우 아래와 같이 출력 된다. 

```
안녕하세요.만나서 반갑습니다. 
```

* 위와 같은 문장을 아래와 같이 줄을 바꿔서 표현하고 싶을 경우 아래와 같이 한다. 

```
안녕하세요.
만나서 반갑습니다. 
```

```
System.out.println("안녕하세요.\n만나서 반갑습니다.");
```
* **\n** 을 출력 내용에 포함 하면 그 시점 부터 줄바꿈이 된다. 
* **new line**의 약자로 **"개행 문자"**라고 한다.
* 이렇게 문장에서 툭수한 기능을 하는 주요 특수한 문자들이 아래와 같이 있다. 

	|특수문자|의미|
	|:---:|:---:|
	|\n|줄 바꿈 (개행)
	|\t|tab 만큼 이동 (수평) |
	|\v|tab 만큼 이동 (수직) |
	|\\"|" 를 출력|
	|\\'|' 를 출력|
	
* **\n , \", \'** 정도가 주로 쓰이고 그외에는 출력에 문제가 있을때 찾아서 사용하시면 되요

## 연산자 - +, -, *, /, % 

* 연산자를 통해서 수와 변수를 연산 할수 있다. 
*  연산자는 일반 수학 기호와 매우 유사하다. 
*  **+ : 더하기 , - : 빼기, * : 곱하기, / : 나누기, % : 나머지**

```
int cola = 1000; 
int water = 500;
int result = 5 + 3;					// result 값 : 8
result =  cola * 3'					// result 값 : 3000
result = cola  * 3 + water * 2;		// result 값 : 4000
result = result / 2;				// result 값 : 2000
result = resutl % 3;				// result 값 : 2
```
* 수학과 같이 연산자 우선 순위가 존재 하기 때문에 유의 해야 한다. 
* 우선순위에 맞더라도, 괄호를 통해서 명확히 하는 것을 추천한다. 

```
result = cola  +  water  * 2;		// result 값 : 2000
result = (cola  +  water)  * 2;		// result 값 : 3000
```

## 형변환 - double result = 7 / 2
* int 형의 두수를 나누 었을때 소수 결과가 나오지 않는다. 
* double result = 7 / 2 일때 result는 3이 저장된다. 
* 정확한 값인 3.5를 얻기 위해서는 두수중 하나가 double type 이어야 한다. 

```
double num = 2;
double result = 7 / num;		//  result 값 3.5;
```

* 직접 변수를 따로 저장 하지 않고 type을 변환 할수 있다. 

```
double result = 7 / (double)2;		//  result 값 3.5;
```
* 위와 같이 하면 2 는 2.0으로 변환되어 double와 같이 동작한다. 
* 아래와 같은 여러 형태로 사용 가능하다. 

```
int num  = 3;
double doubleNumber1 = (double)num;
double doubleNumber2 = 2.0;
```
* 이와 같이 type을 변경하는 작업을 **형변환**또는 **casting** 이라고한다. 
* 형변환은 type의 특성에 따라 데이터의 유실 또는 문제가 발생할 가능성이 있기 때문에 유의해서 사용해야 한다. 

*  [예제보기](ex/Ex02.java)

> 지금 까지 학습한 내용을 아래 문세 링크에서 문제를 풀면서 확인해 보아요.  
> [연습문제](test/test02/README.md)


## Scanner
* 콘솔로 부터 입력을 받게 해주는 클래스이다. 
* 기본적인 사용법은 아래와 같다. 

```
Scanner scan = new Scanner(System.in);
int number = 0; 
number = scan.nextInt();
		
System.out.println("입력 받은 수: " + number);
```
* 첫째 줄의 문장을 통해서 입력을 초기화 하고, scan 이라는 변수를 만든다.
*  세번째 줄처럼 scan 변수에서 nextInt() 라는 함수를 호출하여, 입력을 받고 그 결과를 number에 저장한다. 
* 해당 클래스를 사용하기 위해서는 최 상당에 아래와 같이 import를 해주어야 한다. 

```
import java.util.Scanner;
```

* 출력 결과는 아래와 같다. 

```
3 (입력)
입력 받은 수: 3
```

* 해당 입력 메커니즘은 나중에 나오는 클래스 개념과 함수 개념을 익혀야 완전히 이해가 가능하다. 
* 지금 당장은 형태만 파악하고, 반복적으로 사용해서 익히는 것을 추천한다. 


* 입력 상황이나 형태를 명확히 하기 위해서 scan전에 println를 통해서 설명을 출력 해주는 것이 좋다. 

```
Scanner scan = new Scanner(System.in);
		
int number = 0;
System.out.println("숫자를 입력해 주세요");
number = scan.nextInt();
System.out.println("입력 받은 수: " + number);
```
* 출력 결과는 아래와 같다. 

```
숫자를 입력해 주세요
3
입력 받은 수: 3
```

|함수|설명|
|:---:|:---:|
|nextShort() |short 타입 값을 받아 온다 |
|nextInt() |int 타입 값을 받아 온다 |
|nextFloat() |float 타입 값을 받아 온다 |
|nextDouble() |double 타입 값을 받아 온다 |
|nextLine() |한줄 전체를 받아 온다.|

[예제보기](ex/Ex03.java)

> 지금 까지 학습한 내용을 아래 문세 링크에서 문제를 풀면서 확인해 보아요.  
> [연습문제](test/test03/README.md)

## 상수

* 저장 한다는 의미에서 변수와 유사 
* 단, 변수는 변하는 수 즉 값의 수정이 가능하지만, 상수는 초기화된 값 이후 수정이 불가능
* 문법은 아래와 같이 변수 선언 앞에 final를 명시

```
final int score = 90;
score = 30; // compile error 발생
```
* 값이 고정되어 있거나 변하면 안되는 수에 사용. `ex) final double PI = 3.14; `
* 의도치 않은 변경을 막아 안정성에 도움을 준다. 


> 이번 강에서 배운 내용을 모두 복습하는 종합 문제를 풀어 보세요.  
> [종합문제](test/test04/README.md)

> 쉽게 풀수 없는 고급 문제도 도전 해 보세요.  
> [고급 문제](test/test05/README.md)
