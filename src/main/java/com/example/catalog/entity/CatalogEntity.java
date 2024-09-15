package com.example.catalog.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class CatalogEntity {
@Id
private String id;
private String orderRef;
private String taskType;
private String status;

//getter setter use
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getOrderRef() {
	return orderRef;
}
public void setOrderRef(String orderRef) {
	this.orderRef = orderRef;
}
public String getTaskType() {
	return taskType;
}
public void setTaskType(String taskType) {
	this.taskType = taskType;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}

}
