package principle.isp;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 17:57
 */
public class Client {
	public static void main(String[] args) {
		IPrettyGirl xiaoli = new PrettyGirl();

		AbctractSearcher searcher = new Searcher(xiaoli);
		searcher.show();
	}
}
