package com.uvaan.sampleapi.param;

import java.util.Date;

public class UserParam {

	private Long id;
	private String email;
	private String password;
	private Long createdby;
	private Date createddate;
	private Long updatedby;
	private Date updaateddate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Long createdby) {
		this.createdby = createdby;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public Long getUpdatedby() {
		return updatedby;
	}

	public void setUpdatedby(Long updatedby) {
		this.updatedby = updatedby;
	}

	public Date getUpdaateddate() {
		return updaateddate;
	}

	public void setUpdaateddate(Date updaateddate) {
		this.updaateddate = updaateddate;
	}

}
