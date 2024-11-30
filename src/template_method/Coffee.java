package template_method;

public class Coffee extends CaffeineBeverage {

	void brew() {
		System.out.println("필터로 커피 우려내는 중");
	}

	void addCondiments() {
		System.out.println("설탕과 우유 추가");
	}
}
