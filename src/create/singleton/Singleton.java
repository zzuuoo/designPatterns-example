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

			} else {
				//创建实例之前可能会有一些准备性的耗时工作
				Thread.sleep(300);
				synchronized (Singleton.class) {
					//二次检查
					if (instance == null) {
						instance = new Singleton();
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return instance;

	}
}
