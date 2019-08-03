package create.factormethod;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-03 13:13
 */
public interface CarFactory {
	/**
	 * 制造车方法
	 * @param carName 具体名字
	 * @return 返回具体车辆
	 */
	Car makeCar(String carName);
}
