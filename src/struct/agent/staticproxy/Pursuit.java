package struct.agent.staticproxy;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 20:14
 */
public class Pursuit implements GiveGift{
	private String girl;
	public Pursuit(String girl){
		this.girl = girl;
	}

	@Override
	public void giveFlowers() {
		System.out.println(girl+" 送你花花！");
	}

	@Override
	public void giveChocolate() {
		System.out.println(girl+" 送你爱心巧克力！");
	}

	@Override
	public void giveDolls() {
		System.out.println(girl +" 送你温暖的布偶公仔！");
	}
}
