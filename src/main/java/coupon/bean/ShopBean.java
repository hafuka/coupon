package coupon.bean;

import java.io.Serializable;

public class ShopBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public Integer shopId;
	
	public String shopName;
	
    public String description;

    public String url;

    public String tell;
    
    public String address;

    public String mapUrl;

    public Integer areaId;

    public Integer areaDetailId;

    public String station;

    public Integer premiumFlg;
	
	public String imgPath;
	
	public String featuredCoupon;
	
	public String businessName;
	
	public String areaName;
	
	public String areaDetailName;
	
	public boolean isFavorite;
	
}
