package com.messageapi.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "message")
public class MessageEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "message")
	private String message;
	@Column(name = "deliveryTime")
	private String deliveryTime;
	@Column(name = "deliveryStatus")
	private boolean deliveryStatus;
	@Column(name = "deliveredTime")
	private Timestamp deliveredTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(String deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public boolean isDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(boolean deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public Timestamp getDeliveredTime() {
		return deliveredTime;
	}

	public void setDeliveredTime(Timestamp deliveredTime) {
		this.deliveredTime = deliveredTime;
	}

	@Override
	public String toString() {
		return "MessageEntity [id=" + id + ", message=" + message + ", deliveryTime=" + deliveryTime
				+ ", deliveryStatus=" + deliveryStatus + ", deliveredTime=" + deliveredTime + "]";
	}
}
