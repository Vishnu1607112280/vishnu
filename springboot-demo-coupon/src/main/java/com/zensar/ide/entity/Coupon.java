package com.zensar.ide.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coupon {
	@Id
	private int CouponId;
	private String CouponCode;
	private String CouponExpdate;

	public int getCouponId() {
		return CouponId;
	}

	public void setCouponId(int couponId) {
		CouponId = couponId;
	}

	public String getCouponCode() {
		return CouponCode;
	}

	public void setCouponCode(String couponCode) {
		CouponCode = couponCode;
	}

	public String getCouponExpdate() {
		return CouponExpdate;
	}

	public void setCouponExpdate(String couponExpdate) {
		CouponExpdate = couponExpdate;
	}

	public Coupon() {
		super();
	}

	public Coupon(int couponId, String couponCode, String couponExpdate) {
		super();
		CouponId = couponId;
		CouponCode = couponCode;
		CouponExpdate = couponExpdate;
	}

	@Override
	public String toString() {
		return "Coupon [CouponId=" + CouponId + ", CouponCode=" + CouponCode + ", CouponExpdate=" + CouponExpdate + "]";
	}

}
