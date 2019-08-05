package struct.agent.staticproxy;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 20:15
 */
public class Proxy implements GiveGift{
	Pursuit pursuit;
	public Proxy(Pursuit pursuit){
		this.pursuit = pursuit;
	}

	@Override
	public void giveFlowers() {
		System.out.println("送花前");
		pursuit.giveFlowers();
		System.out.println("送花后");
	}

	@Override
	public void giveChocolate() {
		pursuit.giveChocolate();
	}

	@Override
	public void giveDolls() {
		pursuit.giveDolls();
	}
}
