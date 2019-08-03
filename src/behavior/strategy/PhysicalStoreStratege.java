package behavior.strategy;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 19:39
 */
public class PhysicalStoreStratege implements SaleCarStrategy{
	@Override
	public void sale() {
		System.out.println("在线下实体店卖车");
	}
}
