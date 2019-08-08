package principle.dip;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 13:57
 */
public class XiaoMing implements Idriver{
	@Override
	public void drive(Icar car) {
		car.run();
	}
}
