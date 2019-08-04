package create.factormethod;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 13:17
 */
public class Client {
	public static void main(String[] args) {

		// 现实使用 应该是运行时传进来具体的工厂
		CarFactory factory = new ChineseCarFactory();

		doSomething(factory);

		factory = new AmericanCarFactory();

		doSomething(factory);

	}

	public static void doSomething(CarFactory factory){
		Car car = factory.makeCar("A");
		car.show();
		car = factory.makeCar("B");
		car.show();
	}
}
