package exam20_Generic;

class Box2<T> { // 임의의 데이터를 저장하는 클래스
	T obj;
	
	public void setValue(T obj) {
		this.obj = obj;
	}
	
	public T getValue() {
		return obj;
	}
}

public class GenericTest {
	
	public static void main(String[] args) {
		//제네릭스 사용 안한 경우
		//제네릭스로 만들어도 사용 안할 수 있다.
		Box2 b1 = new Box2();
		b1.setValue("이름");
		System.out.println(b1.getValue());
		b1.setValue("20");
		System.out.println(b1.getValue());
		
		//문자열만 저장
		Box2<String> b2 = new Box2<String>();
		b2.setValue("이름");
		//b2.setValue(10); 제네릭스로 에러 발생.
		String s = b2.getValue(); //형 변환 필요 없음
		System.out.println(s + s.length());
		
		//정수만 저장 요구
		Box2<Integer> b3 = new Box2<Integer>();
		b3.setValue(100);
		//b3.setValue("String"); Integer만 저장 가능
		System.out.println(b3.getValue());
	}

}
