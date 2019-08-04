package behavior.responsibility;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 01:39
 */
public class Client {
	public static void main(String[] args) {
		CommonManager commonManager = new CommonManager("李经理");
		Majordomo majordomo= new Majordomo("陈总监");
		GeneralManager generalManager = new GeneralManager("叶总经理");

		commonManager.setSuperior(majordomo);
		majordomo.setSuperior(generalManager);

		Request request = new Request();
		request.setNumber(4);
		request.setRequestType("请假");
		request.setRequestContent("请假4天");

		commonManager.Request(request);

		Request request1 = new Request();
		request1.setNumber(1);
		request1.setRequestType("请假");
		request1.setRequestContent("请假1天");

		commonManager.Request(request1);

		Request request2 = new Request();
		request2.setNumber(800);
		request2.setRequestType("加薪");
		request2.setRequestContent("申请加薪800");

		commonManager.Request(request2);

		Request request3 = new Request();
		request3.setNumber(8000);
		request3.setRequestType("加薪");
		request3.setRequestContent("申请加薪8000");

		commonManager.Request(request3);
	}
}
