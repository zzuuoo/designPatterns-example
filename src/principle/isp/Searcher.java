package principle.isp;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 17:56
 */
public class Searcher extends AbctractSearcher{
	public Searcher(IPrettyGirl prettyGirl) {
		super(prettyGirl);
	}

	@Override
	public void show() {
		prettyGirl.goodLooking();
		prettyGirl.greatTemperament();
		prettyGirl.niceBody();
	}
}
