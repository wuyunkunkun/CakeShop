package com.catCake.cakeonline.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cakeSize")
public class CakeSize {
	
	private int sizeId ;
	private int cakeSize ;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="sizeId")
	public int getSizeId() {
		return sizeId;
	}
	public void setSizeId(int sizeId) {
		this.sizeId = sizeId;
	}
	@Column(name="cakeSize")
	public int getCakeSize() {
		return cakeSize;
	}
	public void setCakeSize(int cakeSize) {
		this.cakeSize = cakeSize;
	}

}
