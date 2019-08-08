package behavior.responsibility;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 01:30
 */
public abstract class Manager {
	protected String name;
	//上级
	protected Manager superior;

	public Manager(String name) {
		this.name = name;

	}

	public void setSuperior(Manager superior){
		this.superior = superior;
	}

	abstract public void Request(Request request);
}
