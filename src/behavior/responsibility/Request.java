package behavior.responsibility;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 01:32
 */
public class Request {

	private String requestType;
	private String requestContent;
	private int number;

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
