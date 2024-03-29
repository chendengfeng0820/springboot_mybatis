package com.springboot.domain;

public class User {

	private String username;
	private String name;
	private String password;
	private Integer age;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", name='" + name + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				'}';
	}
}
