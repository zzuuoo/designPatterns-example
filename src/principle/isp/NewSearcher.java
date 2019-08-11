package principle.isp;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 18:02
 */
public class NewSearcher extends NewAbstractSearcher{
	public NewSearcher(IGoodBodyGirl prettyGirl) {
		super(prettyGirl);
	}

	@Override
	public void show() {
		prettyGirl.goodLooking();
		prettyGirl.niceBody();

	}
}
