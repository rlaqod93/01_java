package com.pcwk.ex10.address;

//VO(Value Object)
//VO란 이렇게 도메인에서 한 개 또는 그 이상의 속성들을 묶어서 특정 값을 나타내는 객체를 의미한다.

public class AddressBook extends DTO{
	//멤버 변수
	private String name;		//이름
	private String cellphone;	//핸드폰
	private String email;		//email
	private String adderss;		//주소
	private String birthday;	//생년월일
	
	//생성자 meber변수 초기화
	public AddressBook() {
		//this("","","","","");
		
	}

	public AddressBook(String name, String cellphone, String email, String adderss, String birthday) {
		super();
		this.name = name;
		this.cellphone = cellphone;
		this.email = email;
		this.adderss = adderss;
		this.birthday = birthday;
	}
	//리턴값이 있는것
	public String getName() {
		return name;
	}
	//리턴값이 없는것
	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdderss() {
		return adderss;
	}

	public void setAdderss(String adderss) {
		this.adderss = adderss;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	
	
	
	
	
	
}
