package singleton;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;

	private static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler(){
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance(){
		if (uniqueInstance == null) {
			synchronized (ChocolateBoiler.class) {			// 클래스 수준 동기화 ChocolateBoiler 클래스에 모니터 락
				if (uniqueInstance == null) {
					uniqueInstance = new ChocolateBoiler();
				}
			}
		}
		return uniqueInstance;
	}

	public void fill() {
		if (empty){
			empty = false;
			boiled = false;
			// 보일러에 우유와 초콜릿을 혼합한 재료를 넣음
		}
	}

	public void drain() {
		if (!empty && boiled) {
			empty = true;
		}
	}

	public void boil() {
		if (!empty && !boiled) {

		}
	}
}