package struct.agent.jdk;

public class UserServiceImpl implements UserService {

	@Override
	public void addUser() {
		System.out.println("a_proxy.a_jdk addUser");
	}

	@Override
	public void updateUser() {
		System.out.println("a_proxy.a_jdk updateUser");

	}

	@Override
	public void deleteUser() {

		System.out.println("a_proxy.a_jdk deleteUser");
	}

}
