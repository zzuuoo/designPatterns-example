package principle.dip;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 13:56
 */
public class Jeep implements Icar{
	@Override
	public void run() {
		System.out.println("开吉普车");
	}
}
