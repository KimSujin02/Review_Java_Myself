package 클래스_메소드;
//사람 클래스 구현
//클래스 :  객체를 생성할 수 있는 틀.
//클래스 = 상태(변수) + 행동(메소드)
//상태, 속성, 멤버변수 : 각 객체가 독립적으로 값을 저자알 수 있는 공간을 의미
//멤버변수는 클래스 내부에 '자료형 변수이름'으로 선언 할 수 있음
//클래스 내부에 선언한 멤버변수는 객체가 생성이 되면 해당 멤버변수를 저장할 수 있는 공간을 메모리 영역에 할당한다.

public class Human {
	//이름, 나이, 전화번호
	String name, phone; //이것을 멤버변수 / 속성 / 필드 등으로 부른다.
	int age;
	
	
	/*
	 * 메소드 : 특정기능을 수행하기 위한 코드 묶음
	 * 해당 메소드를 호출함으로 써 연산결과를 얻거나 파일 다운로드 등의 기능을 사용하는 것
	 * 메소드 정의
	 * 접근지정자(public같은거.. 생략도 가능하다)반환타입 메소드이름(메소드를 호출할 때 사용되는 입력값)
	 */
	
	
	//자기소개
	void intro() { //접근지정자를 생략한 상태, void(반환값없음), 타입의 입력값이 없는 intro메소드 정의
		//this 키워드 : 객체의 메소드를 호출했을 때, 객체 내부에 존재하는 멤버변수나
		//메소드를 호출할 때 사용할 수 있는 메소드
		//this 키워드는 생략할 수 있으나, 동일한 이름의 지역변수가 있는 경우
		//멤버변수에 접근하는 것이 아닌 지역변수에 접근하는 처리가 되므로 주의해야함
		System.out.println("이름 : " + this.name + "\n전화번호 : " + this.phone + "\n나이 : " + this.age);
	}
	//숨쉬기
	//이동하기
	
	
}
