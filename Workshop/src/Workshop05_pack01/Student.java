package Workshop05_pack01;

public class Student {
	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;
	
	public Student() { }
	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}
	
	public double getAvg() {
		return (korean + english + math + science) / (double)4;
	}
	
	public String getGrade() {
		String result = "F";
		double avg = getAvg();
		
		if (avg >= 90) {
			result = "A";
			return result;
		}
		else if (avg >= 70) {
			result = "B";
			return result;
		}
		else if (avg >= 50) {
			result = "C";
			return result;
		}
		else if (avg >= 30) {
			result = "D";
			return result;
		}
		
		return result;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	
	
}
