package com.zensar.springbootdemoCouponDto;

public class CouponDto {
	private int CouponId;
	private String Couponcode;
	private String CouponExpdate;

	public CouponDto() {
		super();
	}

	public CouponDto(int couponId, String couponcode, String couponExpdate) {
		super();
		CouponId = couponId;
		Couponcode = couponcode;
		CouponExpdate = couponExpdate;
	}

	public int getCouponId() {
		return CouponId;
	}

	public void setCouponId(int couponId) {
		CouponId = couponId;
	}

	public String getCouponcode() {
		return Couponcode;
	}

	public void setCouponcode(String couponcode) {
		Couponcode = couponcode;
	}

	public String getCouponExpdate() {
		return CouponExpdate;
	}

	public void setCouponExpdate(String couponExpdate) {
		CouponExpdate = couponExpdate;
	}

	@Override
	public String toString() {
		return "CouponDto [CouponId=" + CouponId + ", Couponcode=" + Couponcode + ", CouponExpdate=" + CouponExpdate
				+ "]";
	}

}
