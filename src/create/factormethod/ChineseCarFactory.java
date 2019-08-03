package create.factormethod;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 13:14
 */
public class ChineseCarFactory implements CarFactory {
	@Override
	public Car makeCar(String name) {
		Car car = null;
		switch (name) {
			case "A":
				car = new ChineseCarA();
				break;
			case "B":
				car = new ChineseCarB();
				break;
			default:
		}
		return car;
	}
}
