package create.prototype;

/**
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 14:18
 */
public class Resume implements Cloneable{
	private String name;
	private String sex;
	private String age;
	private WorkExperience work;

	public Resume(WorkExperience workExperience){
		this.work =workExperience;
	}
	public WorkExperience getWork() {
		return work;
	}

	public void setWork(WorkExperience work) {
		this.work = work;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		super.clone();
		Resume resume = new Resume(this.work);
		resume.age = this.age;
		resume.name = this.name;
		resume.sex = this.sex;
		resume.work = (WorkExperience) this.work.clone();
		return resume;
	}

	public void disPlay(){
		System.out.println(name+" "+sex+" "+age);
		System.out.println(work);
	}
}
