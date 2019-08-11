package principle.isp;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 17:55
 */
public abstract class AbctractSearcher {
	protected IPrettyGirl prettyGirl;
	public AbctractSearcher(IPrettyGirl prettyGirl){
		this.prettyGirl = prettyGirl;
	}
	public abstract void show();
}
