package behavior.strategy;

/**
 * 销售人员，可以采取不同的策略卖车
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 19:34
 */
public class Saler {
	private SaleCarStrategy strategy;
	public Saler(SaleCarStrategy saleCarStrategy){
		this.strategy = saleCarStrategy;
	}
	public void changeStrategy(SaleCarStrategy saleCarStrategy){
		this.strategy = saleCarStrategy;
	}
	public void sale(){
		this.strategy.sale();
	}
}
