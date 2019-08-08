package behavior.responsibility;

/**
 *	总监
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 01:36
 */
public class Majordomo extends Manager {
	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void Request(Request request) {
		if (request.getRequestType().equals("请假")&&request.getNumber()<7){
			System.out.println(this.name+":"+request.getRequestContent()+"被批准");
		}else{
			if (superior!=null){
				superior.Request(request);
			}

		}
	}
}
