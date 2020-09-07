package com.helloworld.lamda;

public class SampleResponse {
	
	
	private String body;
    private Integer statusCode;
    
    
    
	public SampleResponse(String body, Integer statusCode) {
		this.body = body;
		this.statusCode = statusCode;
	}
	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}
	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}
	/**
	 * @return the statusCode
	 */
	public Integer getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
    
    

}
