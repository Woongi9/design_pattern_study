package template_method;

public class Tea extends CaffeineBeverage {

	public void brew() {
		System.out.println("찻잎을 우러내는 중");
	}

	public void addCondiments() {
		System.out.println("레몬 추가");
	}
}
