package com.catCake.cakeonline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cakeType")
public class CakeType {
	
	private int typeId ;
	private String typeName ;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="typeId")
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	@Column(name="typeName")
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	
}
