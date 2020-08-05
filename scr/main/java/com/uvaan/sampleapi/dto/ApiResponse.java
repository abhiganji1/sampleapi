package com.uvaan.sampleapi.dto;

import org.springframework.http.HttpStatus;


public class ApiResponse {
	
	private int status;
	private String message;
	private Object result;


	

	public ApiResponse(HttpStatus status, String message, Object result) {
		this.status = status.value();
		this.message = message;
		this.result = result;
	}
	public class Reposn {
		
		
		private int responseCode;
		private String responseMsg;
		private Object entity;
		
		public Reposn(int responseCode, String responseMsg, Object entity) {
			super();
			this.responseCode = responseCode;
			this.responseMsg = responseMsg;
			this.entity = entity;
		}
		
		/**
		 * @return the responseCode
		 */
		public int getResponseCode() {
			return responseCode;
		}
		/**
		 * @param responseCode the responseCode to set
		 */
		public void setResponseCode(int responseCode) {
			this.responseCode = responseCode;
		}
		/**
		 * @return the responseMsg
		 */
		public String getResponseMsg() {
			return responseMsg;
		}
		/**
		 * @param responseMsg the responseMsg to set
		 */
		public void setResponseMsg(String responseMsg) {
			this.responseMsg = responseMsg;
		}
		/**
		 * @return the entity
		 */
		public Object getEntity() {
			return entity;
		}
		/**
		 * @param entity the entity to set
		 */
		public void setEntity(Object entity) {
			this.entity = entity;
		}
		
		
		
		

	}

	

	public ApiResponse(HttpStatus status, String message) {
		this.status = status.value();
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "ApiResponse [statusCode=" + status + ", message=" + message + "]";
	}
	



}
