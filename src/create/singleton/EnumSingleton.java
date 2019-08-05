package create.singleton;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-05 14:12
 */
public class EnumSingleton {
	public static void main(String[] args) {
		Single single = Single.SINGLE;
		single.print();
	}

	enum Single implements Cloneable{
		/**
		 * itself
		 */
		SINGLE;

		public void print() {
			System.out.println("hello world");
		}
	}
}
