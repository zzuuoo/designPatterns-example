package create.prototype;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 14:06
 */
public class WorkExperience implements Cloneable{
	private String workDate;
	private String company;

	public String getWorkDate() {
		return workDate;
	}

	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public void show(){
		System.out.println("公司："+company+" 时间"+workDate);
	}
	@Override
	public String toString(){
		return "公司："+company+" 时间"+workDate;
	}
}
