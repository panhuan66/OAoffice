package information;

public class Staff  implements java.io.Serializable {
	private int id;
	private String name;
	private String sex;
	private String dept;
	private int age;
	private String email;
	private String job;
	private String tel;
	private String mob;
	private String add;
	private String role;
	private String hob;
	private String intro;
	
	

	public Staff(int id, String name, String sex, String dept, int age, String email, String job, String tel,
			String mob, String add) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.dept = dept;
		this.age = age;
		this.email = email;
		this.job = job;
		this.tel = tel;
		this.mob = mob;
		this.add = add;
	}
	public Staff() {
		super();
	}
	public Staff(int id, String name, String sex, String dept, int age, String email, String job, String tel,
			String mob, String add, String role, String hob, String intro) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.dept = dept;
		this.age = age;
		this.email = email;
		this.job = job;
		this.tel = tel;
		this.mob = mob;
		this.add = add;
		this.role = role;
		this.hob = hob;
		this.intro = intro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getHob() {
		return hob;
	}
	public void setHob(String hob) {
		this.hob = hob;
	}
	public String getIntro() {
		return intro;
	}
	public void setIntro(String intro) {
		this.intro = intro;
	}


	
}
