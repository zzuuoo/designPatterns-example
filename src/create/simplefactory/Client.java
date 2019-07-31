package create.simplefactory;

import java.util.Scanner;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-07-25 11:02
 */
public class Client {
	public static void main(String[] args) {
		CarFactory carFactory = new CarFactory();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("请输入你要生产的车名：");
			String name = scanner.next();
			Car car = carFactory.createCar(name);
			if (null != car) {
				car.run();
			}
			System.out.println("是否继续生产（Y/other）？:");
			String yn = scanner.next();
			if (!"Y".equals(yn) && !"y".equals(yn)) {
				break;
			}
		}
	}
}
