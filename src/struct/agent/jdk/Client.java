package struct.agent.jdk;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 18:03
 */
public class Client {
	public static void main(String[] args) {
		UserService userService = MyBeanFactory.createService();
		userService.addUser();
		userService.updateUser();
		userService.deleteUser();
	}
}
