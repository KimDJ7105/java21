package exam20_Generic;

class Box { // 임의의 데이터를 저장하는 클래스
	Object obj;
	
	public void setValue(Object obj) {
		this.obj = obj;
	}
	
	public Object getValue() {
		return obj;
	}
}

public class GenericTest2 {
	
	public static void main(String[] args) {
		Box b1 = new Box();
		
		b1.setValue("이름");
		System.out.println(b1.getValue());
		b1.setValue("20");
		System.out.println(b1.getValue());
		
		//이름만 저장해야 한다면?
		Box b2 = new Box();
		b2.setValue("이름");
		b2.setValue(3.14f); 
		//문제 1 : 잘못된 데이터를 컴파일 타임엔 모름
		// 이름이 아닌 숫자를 저장해도 오류가 없음
		Object obj = b2.getValue(); 
		// 문자열이 있다고 믿고 형 변환
		String s = (String)obj; // 문제 2 : 형변환 필수 
		System.out.println(s + s.length());
		//런타임에서 예외가 발생 ClassCastException
	}

}
