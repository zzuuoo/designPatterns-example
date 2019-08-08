package create.factormethod;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 13:17
 */
public class Client {
	public static void main(String[] args) {

		// 现实使用 应该是运行时传进来具体的工厂
		CarFactory factory = new ChineseCarFactory();

		doSomething(factory,"A");

		factory = new AmericanCarFactory();

		doSomething(factory,"B");

	}

	public static void doSomething(CarFactory factory,String name){
		Car car = factory.makeCar(name);
		car.show();

	}
}
