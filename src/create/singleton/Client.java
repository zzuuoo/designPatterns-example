package create.singleton;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 15:12
 */
public class Client {
	public static void main(String[] args) {
		var s = Singleton.getInstance();
		s.doSomething();
	}
}
