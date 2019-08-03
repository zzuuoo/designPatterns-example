package create.factormethod;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 13:16
 */
public class AmericanCarFactory implements CarFactory {
	@Override
	public Car makeCar(String name) {
		Car car = null;
		switch (name) {
			case "A":
				car = new AmericanCarA();
				break;
			case "B":
				car = new AmericanCarB();
				break;
			default:
		}
		return car;
	}
}
