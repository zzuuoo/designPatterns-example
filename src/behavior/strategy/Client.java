package behavior.strategy;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 19:34
 */
public class Client {
	public static void main(String[] args) {
		Saler saler = new Saler(new GuaZiAppStratege());
		saler.sale();

		saler.changeStrategy(new PhysicalStoreStratege());
		saler.sale();
	}
}
