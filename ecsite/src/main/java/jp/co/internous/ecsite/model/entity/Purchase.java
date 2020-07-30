package jp.co.internous.ecsite.model.entity;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="purchase")
public class Purchase {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="user_id")
	private long userId;
	
	@Column(name="goods_id")
	private long goodsId;
	
	@Column(name="goods_name")
	private String goodsName;
	
	@Column(name="item_count")
	private long itemCount;
	
	@Column(name="total")
	private long total;
	
	@Column(name="created_at")
	private Timestamp createdAt;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getUser_id() {
		return userId;
	}
	
	public void setUser_id(long userId) {
		this.userId = userId;
	}
	
	public long getGoods_id() {
		return goodsId;
	}
	
	public void setGoods_id(long goodsId) {
		this.goodsId = goodsId;
	}
	
	public String getGoods_name() {
		return goodsName;
	}
	
	public void setGoods_name(String goodsName) {
		this.goodsName = goodsName;
	}
	
	public long getItem_count() {
		return itemCount;
	}
	
	public void setItem_count(long itemCount) {
		this.itemCount = itemCount;
	}
	
	public long getTotal() {
		return total;
	}
	
	public void setTotal(long total) {
		this.total = total;
	}
	
	public Timestamp getCreated_at() {
		return createdAt;
	}
	
	public void setCreated_at(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

}
