package com.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class StatusPOJO {
	private boolean status;

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public StatusPOJO(boolean status) {
		super();
		this.status = status;
	}
	

}
