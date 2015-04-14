/**
 * 
 */
package com.atlantis.vo;

import java.io.Serializable;

/**
 * @author Praveen Kumar
 *
 */
public class BrokerVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4635254352299932072L;
	public Long brokerID;
	public String brokerName;
	public String description;
	public Long getBrokerID() {
		return brokerID;
	}
	public void setBrokerID(Long brokerID) {
		this.brokerID = brokerID;
	}
	public String getBrokerName() {
		return brokerName;
	}
	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
