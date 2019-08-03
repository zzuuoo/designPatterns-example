package create.factormethod;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 13:17
 */
public class Client {
	public static void main(String[] args) {
		CarFactory factory = new ChineseCarFactory();
		Car car = factory.makeCar("A");
		car.show();
		car = factory.makeCar("B");
		car.show();

		factory = new AmericanCarFactory();
		car = factory.makeCar("A");
		car.show();
		car = factory.makeCar("B");
		car.show();

	}
}
