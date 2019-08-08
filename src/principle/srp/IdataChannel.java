package principle.srp;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-08 14:14
 */
public interface IdataChannel {
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
