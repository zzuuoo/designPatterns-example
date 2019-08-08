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

		Resume resume = new Resume(workExperience);
		resume.setAge("14");
		resume.setName("呱呱");
		resume.setSex("男");

		resume.disPlay();

		Resume k = (Resume) resume.clone();
		k.disPlay();;

		var work = k.getWork();
		work.setWorkDate("2011-10-10");
		work.setCompany("毛豆");
		k.setWork(work);

		k.disPlay();

		resume.disPlay();

	}
}
