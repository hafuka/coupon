package coupon.dto;

import java.io.Serializable;

import coupon.entity.MShop;

/**
 * お店情報
 */
public class ShopDto implements Serializable {
	public MShop shop;
	public String business;
	public String area;
	public String areaDetail;
}
