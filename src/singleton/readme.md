## 싱글턴 패턴

> 클래스 인스턴스를 하나만 만들고, 그 인스턴스로의 전역 접근을 제공

---

<br></br>

### Before

>초콜릿 공장에서 초콜릿을 끓이는 장치를 컴퓨터로 제어한다.
보일러는 초클릿이 비어있을때만 돌아가고 비어있으면 초콜릿을 넣는다. 오류가 생길시 500갤런의 초콜릿을 그냥 흘러보낼 수 있다.

> 최근 반영한 코드에서 멀티 스레드를 사용하도록 초콜릿 보일러 컨트롤러를 최적화 시켰는데 500갤런이나 되는 우유와 초콜릿이 흘러넘쳤다.

<br></br>
멀티스레딩 관련 문제는 다음과 같이 동기화 선언 하면 간단하게 해결된다.

```java
public class Singleton {
    private static Singleton singleton;
	
	// 기타 변수

	private Singleton() {}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
	
	// 기타 메소드
}
```

하지만 getInstance()의 속도가 중요하다면 문제가 병목을 야기할 수 있다.
(_동기화 선언하면 성능이 100배 정도 저하된다._)


<br></br>

싱글턴의 인스턴스를 생성하고 사용하거나 인스턴스를 실행 중에 수시로 만들고 관리하기 성가신다면 처음부터 Singleton 인스턴스를 만들면 JVM 로딩시 하나뿐인 인스턴스 생성 가능. 
```java
public class Singleton {
	private static Singleton uniqueInstance = new Singleton();

	private Singleton() {}

	public static synchronized Singleton getInstance() {
		return uniqueInstance;
	}
}
```

<br></br>

다른 방법으로 DCL(Double-Checked Locking)을 사용하면 인스터스가 생성되어 있는지 확인한 다음 생성되어 있지 않았을 때만 동기화 가능(**처음만 동기화**)

```java
public class Singleton {
	private static Singleton uniqueInstance;

	private Singleton() {}

	public static synchronized Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
	}
}
```