package behavior.strategy;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 19:36
 */
public class GuaZiAppStratege implements SaleCarStrategy{
	@Override
	public void sale() {
		System.out.println("在瓜子二手车平台卖车");
	}
}
