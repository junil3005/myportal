package himedia.myportal.repositories.vo;

import java.util.Date;

public class UserVo {
	private Integer no;
	private String name;
	private String emil;
	private String password;
	private String gender;
	private Date joindate;
	
	//	기본생성자
	public UserVo() {
		super();
	}
	
	//	생성자
	public UserVo(String name, String emil, String password, String gender) {
		super();
		this.name = name;
		this.emil = emil;
		this.password = password;
		this.gender = gender;
	}
	
	//	전체 생성자
	public UserVo(Integer no, String name, String emil, String password, String gender, Date joindate) {
		super();
		this.no = no;
		this.name = name;
		this.emil = emil;
		this.password = password;
		this.gender = gender;
		this.joindate = joindate;
	}
	
	// getter and setter 
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmil() {
		return emil;
	}
	public void setEmil(String emil) {
		this.emil = emil;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	@Override
	public String toString() {
		return "UserVo [no=" + no + ", name=" + name + ", emil=" + emil + ", password=" + password + ", gender="
				+ gender + ", joindate=" + joindate + "]";
	}
	
	
}
