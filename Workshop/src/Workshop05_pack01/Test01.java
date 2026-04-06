package Workshop05_pack01;

public class Test01 {

	public static void main(String[] args) {
		Student [] s = new Student[] {new Student("Kim", 100, 90, 95, 89),
				new Student("Lee", 60, 70, 99, 98),
				new Student("Park", 68, 86, 60, 40)};
		
		
		for(int i = 0 ; i < s.length ; ++i) {
			System.out.println(s[i].getName() + "의 평균 : " + s[i].getAvg());
			System.out.println(s[i].getName() + "의 학점 : " + s[i].getGrade());
		}
	}

}
