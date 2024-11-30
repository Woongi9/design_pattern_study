## 퍼사드 패턴

> 서브시스템에 있는 일련의 인터페이스를 통합 인터페이스로 묶어 줍니다. 고수준 인터페이스도 정의하므로 서브시스템을 더 편리하게 사용할 수 있게 만듬

영화 보는데에 몇가지 일이 필요합니다.
1. 팝콘 기계를 킨다.
2. 팝콘을 튀긴다.
3. 조명을 어둡게 조절한다.
4. 스크린을 내린다.
5. 프로젝터를 켠다.
6. 프로젝터 입력을 스트리밍 플레이어로 설정한다.
7. 프로젝터를 와이드 스크린 모드로 전환한다.
8. 앰프를 서라운드 음향 모드로 전환한다.
9. 앰프 볼륨을 중간으로 설정한다.
10. 스트리밍 플레이어를 켠다.
11. 영화를 재생한다.

---

### 구현

**이전 코드**
```java
popper.on();
popper.pop();

lights.dim(10)l

screen.down();

projector.on();
projector.setInput(player);
projector.wideScreenMode();

amp.on();
amp.setDvd(player);
amp.setSurroundSound();
amp.setVolume(5);

player.on();
player.play(movie);
```

클래스 6개 필요

**홈시어터 퍼사드 생성**
```java
public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	StreamingPlayer player;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	
	public HomeTheaterFacade(
		Amplifier amp, 
	    Tuner tuner, 
	    StreamingPlayer player, 
	    Projector projector, 
	    TheaterLights lights, 
	    Screen screen, 
	    PopcornPopper popper){
		    this.amp;
		    this.tuner;
		    this.player;
		    this.projector;
		    this.lights;
		    this.screen;
		    this.popper;
    }

	public void watchMovie(){
        ...
    }
	
	public void endMovie(){
        ...
    }
}
```

* `HomeTheaterFacade`는 클라이언트 대신 모든 서브시스템 구성 요소를 관리
* 홈시어터 구성 요소를 업그레이드해도 클라이언트는 아무 영향을 받지 않음

<br></br>

---

### 최소 지식 원칙

> 객체 사이의 상호작용은 될 수 있으면 아주 가까운 사이에서만 허용하는 편이 좋음

**원칙을 따르지 않는 경우**
```java
public float getTemp(){
	Thermometer thermometer = station.getThermmometer();
	return thermometer.getTemperature();
}
```

**원칙을 따른 경우**
```java
public float getTemp(){Thermometer thermometer = station.getThermmometer();
	return station.getTemperature();
}
```