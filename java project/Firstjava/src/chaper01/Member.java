package chaper01;

public class Member {
	
	// 2. member 클래스를 생성하고,
	
	public static void main(String[] args) {
		// static : 바이트 코드가 가상머신에서 실행하는 시점에 메소드 코드가 메모리에 로드된다.
		System.out.println("길성제");
		System.out.println("메소드 호출");
		sayName();
		
		
		}
	
	// 이름을 출력하는 메소드
	// 반환타입 메소드 이름 (매개변수,....)
	static void sayName() {
		System.out.println("길성제");
	}

}
