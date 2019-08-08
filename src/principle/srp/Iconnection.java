package principle.srp;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 14:14
 */
public interface Iconnection {
	/**
	 * 拨打
	 * @param number
	 */

	void dial(String number);


	/**
	 * 挂断
	 */
	void handup();
}
