package create.singleton;

/**
 * 单例模式demo
 * @author zuoweixing@guazi.com
 * @date 2019-07-31 15:16
 */
public class Singleton {
	private static final Singleton singleton = new Singleton();

	/**
	 * 禁止通过new Sinleton()实例化
	 */
	private Singleton() {
	}

	public static Singleton getInstance() {
		return singleton;
	}

	public void doSomething() {
		System.out.println("doing something ...");
	}
}
