package create.prototype;

/**
 * 一般需要频繁创建复杂对象而要保留对象的状态信息才需要
 * @author zuoweixing@guazi.com
 * @date 2019-08-04 10:49
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {

		WorkExperience workExperience = new WorkExperience();
		workExperience.setCompany("瓜子");
		workExperience.setWorkDate("2019-2020");
		workExperience.show();
		Resume resume = new Resume(workExperience);
		resume.setAge("14");
		resume.setName("呱呱");
		resume.setSex("男");
		resume.disPlay();
		var b  = new WorkExperience();;
		b.setCompany("毛豆");
		b.setWorkDate("2017-2019");
		Resume a = (Resume) resume.clone();
		a.disPlay();
		a.setWork(b);
		a.disPlay();
		resume.disPlay();

	}
}
