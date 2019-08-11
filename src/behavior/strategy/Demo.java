package behavior.strategy;

import java.util.*;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-12 01:15
 */
public class Demo {
	public static void main(String[] args) {
		// 初始化一个list
		List<Integer> list = new ArrayList<>();
		for (int i=0;i<100;i++){
			var r = new Random();
			list.add(r.nextInt(1000));
		}
		System.out.println(list);
		Scanner scanner = new Scanner(System.in);


			// 具体策略
		var strategyA = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2.compareTo(o1);
			}
		};
		// 具体策略
		var strategyB = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		};
		Comparator c;
		// 客户端根据实际情况选择具体策略
		System.out.println("请输入你要的排序1升0降：");
		int n = scanner.nextInt();
		switch (n){
			case 1:
				c = strategyB;
				break;
			case 0:
				c = strategyA;
				break;
				default:
					c = strategyA;
					break;
		}
		//上下文调用策略
		Collections.sort(list, c);

		System.out.println(list);
	}
}
