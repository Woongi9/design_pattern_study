package proxy;

import java.lang.reflect.Proxy;

public class ProxyFactory {
	public static Person getOwnerProxy(Person person) {
		return (Person) Proxy.newProxyInstance(
			person.getClass().getClassLoader(),
			person.getClass().getInterfaces(),
			new OwnerInvocationHandler(person)
		);
	}

	public static Person getNonOwnerProxy(Person person) {
		return (Person) Proxy.newProxyInstance(
			person.getClass().getClassLoader(),
			person.getClass().getInterfaces(),
			new NonOwnerInvocationHandler(person)
		);
	}
}
