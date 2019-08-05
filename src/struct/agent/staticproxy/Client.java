package struct.agent.staticproxy;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 20:16
 */
public class Client {
	public static void main(String[] args) {
		Proxy proxy = new Proxy(new Pursuit("小芳"));
		proxy.giveChocolate();
		proxy.giveDolls();
		proxy.giveFlowers();
	}
}
