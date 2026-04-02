package exam09_Class2;

//실습을 위해 Student Class 를 만들어봅시다.
//이름, 나이, 주소 저장
//행동
//3개의 객체를 만들고 관리해보기
// 홍길동 20 서울
// 이순신  ? 광주
// 유관순 18  ?


public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student("홍길동", 20, "서울");
		Student st2 = new Student("이순신", "광주");
		Student st3 = new Student("유관순", 18);
		
		st1.get_info();
		st2.get_info();
		st3.get_info();
		
		//배열로 관리해볼까요?
		Student [] students = {new Student("홍길동", 20, "서울"),
				new Student("이순신", "광주"), 
				new Student("유관순", 18)};
		
		for(final Student s : students) {
			s.get_info();
		}
	}

}
