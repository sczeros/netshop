package com.netshop.model;

import java.util.Date;

/**
 * @Description: 商品模块实体类
 */
public class Items {
	private Integer item_id;// 商品ID，主键
	private int item_wid;// 厂家ID
	private String item_name;// 商品名称
	private double item_price;// 商品销售单价
	private Date item_gdate;// 生产日期
	private String item_caid;// 商品类型id
	private String item_descn;// 商品描述
	private Category category;// 所属分类
	private String item_pic;// 图片
	private double purprice;// 进货价
	private String barcode;// 条形码
	private int item_come;//入库数量
	private int item_go;//出库数量
	private int item_stock;//库存数量
	
	
	public String getItem_pic() {
		return item_pic;
	}

	public int getItem_come() {
		return item_come;
	}

	public void setItem_come(int item_come) {
		this.item_come = item_come;
	}

	public int getItem_go() {
		return item_go;
	}

	public void setItem_go(int item_go) {
		this.item_go = item_go;
	}

	public int getItem_stock() {
		return item_stock;
	}

	public void setItem_stock(int item_stock) {
		this.item_stock = item_stock;
	}

	public void setItem_pic(String item_pic) {
		this.item_pic = item_pic;
	}

	public Integer getItem_id() {
		return item_id;
	}

	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}

	public int getItem_wid() {
		return item_wid;
	}

	public void setItem_wid(int item_wid) {
		this.item_wid = item_wid;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public double getItem_price() {
		return item_price;
	}

	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}

	public Date getItem_gdate() {
		return item_gdate;
	}

	public void setItem_gdate(Date item_gdate) {
		this.item_gdate = item_gdate;
	}

	public String getItem_caid() {
		return item_caid;
	}

	public void setItem_caid(String item_caid) {
		this.item_caid = item_caid;
	}

	public String getItem_descn() {
		return item_descn;
	}

	public void setItem_descn(String item_descn) {
		this.item_descn = item_descn;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public double getPurprice() {
		return purprice;
	}

	public void setPurprice(double purprice) {
		this.purprice = purprice;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

}
