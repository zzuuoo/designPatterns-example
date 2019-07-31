package create.factory;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-07-25 10:56
 */
public class Taxi implements Car{
	@Override
	public void run() {
		System.out.println("Taxi run");
	}
}
