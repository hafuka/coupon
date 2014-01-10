package coupon.service;

import java.util.List;

import org.apache.struts.util.LabelValueBean;

public interface PullDownService {

	public abstract List<LabelValueBean> getAreaList();
	
	public abstract List<LabelValueBean> getAreaDetailList(Integer areaId);
	
	public abstract List<LabelValueBean> getBusinessList();
	
}
