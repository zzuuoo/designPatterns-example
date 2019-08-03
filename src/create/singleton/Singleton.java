package create.singleton;

/**
 * 单例模式demo
 * @author zuoweixing@guazi.com
 * @date 2019-07-31 15:16
 */
public class Singleton {

	/**
	 * 使用volatile关键字保其可见性
	 */
	volatile private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		try {
			//懒汉式
			if (instance != null) {
				return instance;

			} else {
				synchronized (Singleton.class) {
					//二次检查
					if (instance == null) {
						instance = new Singleton();
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return instance;

	}

	public void doSomething(){
		System.out.println("Doing something");
	}

}
