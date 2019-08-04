package behavior.responsibility;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 01:37
 */
public class GeneralManager extends Manager{
	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void Request(Request request) {
		if (request.getRequestType().equals("请假")&&request.getNumber()<100){
			System.out.println(this.name+":"+request.getRequestContent()+"被批准");
		}else if (request.getRequestType().equals("加薪")&&request.getNumber()<=1000){
			System.out.println(this.name+":"+request.getRequestContent()+"被批准");
		}
		else{
			System.out.println(this.name+":"+request.getRequestContent()+" 再说吧！");
		}
	}
}
