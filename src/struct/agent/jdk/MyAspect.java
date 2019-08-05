package struct.agent.jdk;

public class MyAspect {
	
	public void before(){
		System.out.println("执行前执行中");
	}
	
	public void after(){
		System.out.println("执行后执行中");
	}

}
