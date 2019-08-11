package principle.isp;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 18:01
 */
public abstract class NewAbstractSearcher {
	protected IGoodBodyGirl prettyGirl;
	public NewAbstractSearcher(IGoodBodyGirl prettyGirl){
		this.prettyGirl = prettyGirl;
	}
	public abstract void show();
}
