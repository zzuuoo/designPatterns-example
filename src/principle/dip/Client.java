package principle.dip;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 13:57
 */
public class Client {
	public static void main(String[] args) {
		Idriver xiaoming = new XiaoMing();
		Icar icar = new Jeep();
//		icar = new BMW();
		xiaoming.drive(icar);

	}
}
