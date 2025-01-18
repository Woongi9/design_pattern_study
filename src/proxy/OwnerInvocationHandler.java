package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	private Person person;

	public OwnerInvocationHandler(Person person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if (method.getName().startsWith("get")) {
			return method.invoke(person, args);
		} else if (method.getName().equals("setGeekRating")) {
			throw new IllegalAccessException("You cannot rate yourself!");
		} else if (method.getName().startsWith("set")) {
			return method.invoke(person, args);
		}
		return null;
	}
}
