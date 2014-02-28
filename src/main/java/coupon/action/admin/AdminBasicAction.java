package coupon.action.admin;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.Resource;

import org.apache.struts.upload.FormFile;
import org.seasar.struts.annotation.Execute;

import coupon.entity.MShop;
import coupon.service.ShopService;
import coupon.util.ImageFileUtils;

public class AdminBasicAction extends AdminBaseAction {

	@Resource
	protected ShopService shopService;

	public String shopName;
	public String description;
	public String url;
	public String address;
	public String tell;
	public String station;
	
	public FormFile image;

	@Execute(validator = false)
	public String index() {
		
		shopService.getShopBean(loginAdminDto.shopId);
		
		return "admin_basic.ftl";
	}

	@Execute(validator = false)
	public String regist() throws FileNotFoundException, IOException {
		
		String fileName = loginAdminDto.shopId + ".jpg";
		ImageFileUtils.writeImage("/var/www/images/coupon/"+fileName, image.getFileData());
		
		MShop mShop = new MShop();
		shopService.insertMShop(mShop);

		return "admin_basic.ftl";
	}
	
	
}
