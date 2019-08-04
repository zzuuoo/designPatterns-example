package behavior.responsibility;

/**
 * 经理，可以有请假三天以内的权限
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 01:33
 */
public class CommonManager extends Manager{
	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void Request(Request request) {
		if (request.getRequestType().equals("请假")&&request.getNumber()<3){
			System.out.println(this.name+":"+request.getRequestContent()+"被批准");
		}else{
			if (superior!=null){
				superior.Request(request);
			}

		}
	}
}
