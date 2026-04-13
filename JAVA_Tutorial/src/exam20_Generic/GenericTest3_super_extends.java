package exam20_Generic;

import java.util.ArrayList;
import java.util.List;

class Pet {}
class Dog extends Pet {}
class Cat extends Pet {}

public class GenericTest3_super_extends {

	public static void main(String[] args) {
		// 타입이 같거나 부모 또는 같거나 자식으로 제한하는 방법
		
		// <? super T>
		// <? extends T>
		
		List<Cat> list = new ArrayList<Cat>();
		List<Dog> list2 = new ArrayList<Dog>();
		List<Pet> list3 = new ArrayList<Pet>();
		
		list.add(new Cat());
		list.add(new Cat());
		list2.add(new Dog());
		list2.add(new Dog());
		list3.add(new Pet());
		list3.add(new Pet());
		
		printData(list);
		printData(list3);
		//printData(list2);
		//사용 불가
		
		printData2(list);
		printData2(list2);
		printData2(list3);
	}
	
	//전달하는 데이터 타입 및 부모만 가능하게 하기
	//Cat 혹은 Cat의 부모만 가능
	public static void printData(List<? super Cat> list) {
		System.out.println(list);
	}
	
	//pet과 pet의 자식들만 사용 가능
	public static void printData2(List<? extends Pet> list) {
		System.out.println(list);
	}
	
}
