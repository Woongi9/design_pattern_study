import adapter.Duck;
import adapter.MallardDuck;
import adapter.Turkey;
import adapter.TurkeyAdapter;
import adapter.WildTurkey;
import command.GarageDoor;
import command.GarageDoorCloseCommand;
import command.GarageDoorOpenCommand;
import command.Light;
import command.LightOffCommand;
import command.LightOnCommand;
import command.RemoteControl;
import iterator.DinerMenu;
import iterator.PancakeHouseMenu;
import iterator.Waitress;
import proxy.Person;
import proxy.PersonImpl;
import proxy.ProxyFactory;

public class Main {
	public static void main(String[] args) {
		PersonImpl joe = new PersonImpl();
		joe.setName("민수");
		joe.setGender("남");
		joe.setInterests("프로그래밍, 맛집 탐방");

		// 본인 프록시 생성
		Person ownerProxy = ProxyFactory.getOwnerProxy(joe);
		System.out.println("이름 (OwnerProxy): " + ownerProxy.getName());

		ownerProxy.setInterests("컴퓨터 게임, 윙슈트");
		System.out.println("수정된 Interests: " + ownerProxy.getInterests());

		try {
			ownerProxy.setGeekRating(5); // 본인은 본인의 괴짜 지수를 설정할 수 없음
		} catch (Exception e) {
			System.out.println("본인 프록시에는 괴짜 지수를 매길 수 없습니다.");
		}

		// 다른 사람이 접근하는 프록시 생성
		System.out.println();
		Person nonOwnerProxy = ProxyFactory.getNonOwnerProxy(joe);
		System.out.println("이름 (NonOwnerProxy): " + nonOwnerProxy.getName());

		try {
			nonOwnerProxy.setInterests("등산"); // 다른 사람의 개인정보 변경 불가
		} catch (Exception e) {
			System.out.println("타인 프록시에 관심 사항을 수정할 수 없습니다.");
		}

		nonOwnerProxy.setGeekRating(10); // 다른 사람이 괴짜 지수 평가 가능
		System.out.println("괴짜 지수: " + joe.getGeekRating());
	}
}