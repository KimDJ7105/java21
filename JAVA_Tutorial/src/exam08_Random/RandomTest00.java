package exam08_Random;

import java.util.Random;

public class RandomTest00 {

	public static void main(String[] args) {
		Random r = new Random(); // 랜덤 객체 생성
		
		//r.setSeed(1234);
		
		for(int i = 0 ; i < 10 ; ++i) {
			System.out.println(r.nextInt());
		}		
		
		System.out.println("==================");
		
		for(int i = 0 ; i < 10 ; ++i) {
			System.out.println(r.nextInt(100));
		}
	}

}
