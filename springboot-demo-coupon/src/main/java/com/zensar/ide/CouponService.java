package com.zensar.ide;

import java.util.List;

import com.zensar.springbootdemoCouponDto.CouponDto;
import com.zensar.ide.entity.Coupon;

public interface CouponService {
	public CouponDto getCoupon(int CouponId);

	public List<CouponDto> getCoupons();

	public CouponDto insertCoupon(CouponDto couponDto);

	public void updateCoupon(int CouponId, CouponDto couponDto);

	public void deleteCoupon(int CouponId);
}
