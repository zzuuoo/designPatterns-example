package principle.srp;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 13:46
 */
public interface Iphone {

//	链接管理：dial(), hangup();
//	数据通信：send(), recv();
	/**
	 * 拨打
	 * @param number
	 */

	void dial(String number);


	/**
	 * 挂断
	 */
	void handup();

	/**
	 * 聊天 发送数据
	 * @param o
	 */
	void send(Object o);

	/**
	 * 聊天 接受数据
	 */
	void recv();

}
