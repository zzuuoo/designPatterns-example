package create.simplefactory;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-07-25 10:59
 */
public class CarFactory {
	public  Car createCar(String carName){
		Car car = null;
		switch (carName){
			case "Jeep":
				car = new Jeep();
				break;
			case "Taxi":
				car = new Taxi();
				break;
			case "Ambulance":
				car = new Taxi();
				default:
					System.out.println("没有生产该车的权限");
					break;
		}
		return car;

	}
}
