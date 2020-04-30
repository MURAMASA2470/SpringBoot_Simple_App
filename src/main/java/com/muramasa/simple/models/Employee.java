/**
 * 
 */
package com.muramasa.simple.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author muramasa2470
 *
 */
@Entity
@Table(name="employees")
public class Employee {
	
	// auto_increment
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(name="name_kana")
	private String nameKana;
	private String sex;
	private Date birthday;
	private String tel;
	private String mail;
	@Column(name="postal_code")
	private String postalCode;
	private String address;
	@Column(name="department_id")
	private Long departmentId;
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getNameKana() {
		return nameKana;
	}


	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Date getBirthday() {
		return birthday;
	}


	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Long getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

}
