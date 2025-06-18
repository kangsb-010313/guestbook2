package com.javaex.vo;

public class GuestbookVO {
	
	//필드
	private int no;
	private String name;
	private String password;
	private String content;
	private String datetime;
	
	
	//생성자
	public GuestbookVO() {
	}
	public GuestbookVO(int no, String name, String password, String content, String datetime) {
		this.no = no;
		this.name = name;
		this.password = password;
		this.content = content;
		this.datetime = datetime;
	}
	
	
	//메소드 gs
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getDatetime() {
		return datetime;
	}
	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "GuestbookVO [no=" + no + ", name=" + name + ", password=" + password + ", content=" + content
				+ ", datetime=" + datetime + "]";
	}
	

}
