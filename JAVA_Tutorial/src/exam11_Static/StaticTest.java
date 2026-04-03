package exam11_Static;

class Test {
	int num = 0;
	//static 변수
	static int size = 20;
	static int count = 0;
	
	public void print_num() {
		System.out.println(num);
		//일반 메서드에서는 static 변수 접근 가능
		System.out.println(size);
	}
	
	//static 메서드
	public static void print_size() {
		System.out.println(size);
		//System.out.println(num);
		//this
		//static 메서드에서는 일반 변수 접근 불가
		//this 도 불가능
	}
	
	public Test() {
		count++; 
		// Test 객체가 얼마나 생성되었는지 계산
		num++;
		// static이 아닌 멤버 변수는 객체별로 생성
	}
}

public class StaticTest {

	public static void main(String[] args) {
		//static 메서드와 변수에 접근하는 방법
		System.out.println(Test.size);
		Test.print_size();
		
		System.out.println(Test.count);
		Test t = new Test();
		System.out.println(t.num);
		System.out.println(Test.count);
		Test t2 = new Test();
		System.out.println(t2.num);
		System.out.println(Test.count);
		Test t3 = new Test();
		System.out.println(t3.num);
		//num은 일반 변수로, 객체마다 따로 가지고 있음
		System.out.println(Test.count);
		// Test 객체의 생성 숫자 확인 가능
	}

}
