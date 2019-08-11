package principle.lsp;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 17:48
 */
public class Client {
	public static void main(String[] args) {

		ICar car =  new ACar();
		car.run();

		car = new BCar();
		car.run();
	}
}
