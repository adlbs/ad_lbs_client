package com.steam.adLBS.model;

public class user {

	private int id;		//�û�id
	private String name; //�û�����
	private String password;//�û�����
	private int type;		//�û�����
	private String email;//����
	private int sex;	//�Ա�
	private int age;	//����
	private int hubby;	//����
	private String address;//���ڵ�
	private String sing;	//ǩ��
	
	public user() {
	}
	
	public user(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public user(int id, String name, String password, int type, String email,
			int sex, int age, int hubby, String address, String sing) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.type = type;
		this.email = email;
		this.sex = sex;
		this.age = age;
		this.hubby = hubby;
		this.address = address;
		this.sing = sing;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHubby() {
		return hubby;
	}

	public void setHubby(int hubby) {
		this.hubby = hubby;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSing() {
		return sing;
	}

	public void setSing(String sing) {
		this.sing = sing;
	}

	
	
}
