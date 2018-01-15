package com.catCake.cakeonline.admin.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cake")
public class Cake {
	private int cakeId ;
	private String cakeName ;
	private int price ;
	private String discount ;
	private int discountprice;
	private String description;
	private String img1;
	private String img2;
	private String img3;
	private CakeType cakeType;
	private CakeSize cakeSize;
	private CakeColour cakeColour ;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cakeId")
	public int getCakeId() {
		return cakeId;
	}
	public void setCakeId(int cakeId) {
		this.cakeId = cakeId;
	}
	@Column(name="cakeName")
	public String getCakeName() {
		return cakeName;
	}
	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}
	
	@Column(name="price")
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Column(name="discount")
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	@Column(name="discountPrice")
	public int getDiscountprice() {
		return discountprice;
	}
	public void setDiscountprice(int discountprice) {
		this.discountprice = discountprice;
	}
	@Column(name="description")
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Column(name="img1")
	public String getImg1() {
		return img1;
	}
	public void setImg1(String img1) {
		this.img1 = img1;
	}
	@Column(name="img2")
	public String getImg2() {
		return img2;
	}
	public void setImg2(String img2) {
		this.img2 = img2;
	}
	@Column(name="img3")
	public String getImg3() {
		return img3;
	}
	public void setImg3(String img3) {
		this.img3 = img3;
	}
	@ManyToOne
	@JoinColumn(name="typeId")
	public CakeType getCakeType() {
		return cakeType;
	}
	public void setCakeType(CakeType cakeType) {
		this.cakeType = cakeType;
	}
	@ManyToOne
	@JoinColumn(name="sizeId")
	public CakeSize getCakeSize() {
		return cakeSize;
	}
	public void setCakeSize(CakeSize cakeSize) {
		this.cakeSize = cakeSize;
	}
	@ManyToOne
	@JoinColumn(name="colourId")
	public CakeColour getCakeColour() {
		return cakeColour;
	}
	public void setCakeColour(CakeColour cakeColour) {
		this.cakeColour = cakeColour;
	}
}
