package com.example.demo.Exception;

import java.util.Date;

public class ErreurMessage {
	private Date date;
	private String message;
	private Integer code;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public ErreurMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErreurMessage(Date date, String message, Integer code) {
		super();
		this.date = date;
		this.message = message;
		this.code = code;
	}

}
