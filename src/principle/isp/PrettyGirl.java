package principle.isp;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 17:54
 */
public class PrettyGirl implements IPrettyGirl{
	@Override
	public void goodLooking() {
		System.out.println("好看");
	}

	@Override
	public void niceBody() {
		System.out.println("好身材");
	}

	@Override
	public void greatTemperament() {
		System.out.println("好气质");
	}
}
