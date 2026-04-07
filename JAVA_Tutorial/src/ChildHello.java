

import exam13_package.MyHello;

public class ChildHello extends MyHello{
	public void method2() {
		//외부 패키지에서 상속받은 class는
		//public과 protected에 접근 가능하다.
		
		System.out.println(pub_s); 
		System.out.println(protect_s); 
		//System.out.println(def_s); 
		//System.out.println(priv_s); 
		
	}
}
