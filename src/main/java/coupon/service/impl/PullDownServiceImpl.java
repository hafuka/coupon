package coupon.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.struts.util.LabelValueBean;

import coupon.dao.MAreaDao;
import coupon.dao.MAreaDetailDao;
import coupon.dao.MBusinessDao;
import coupon.entity.MArea;
import coupon.entity.MAreaDetail;
import coupon.entity.MBusiness;
import coupon.service.PullDownService;

public class PullDownServiceImpl implements PullDownService {
	
	@Resource
	protected MAreaDao mAreaDao;
	@Resource
	protected MAreaDetailDao mAreaDetailDao;
	@Resource
	protected MBusinessDao mBusinessDao;
	
	@Override
	public List<LabelValueBean> getAreaList() {
		
		List<LabelValueBean> list = null;
		
		List<MArea> areaList = mAreaDao.findAll();
		if (!CollectionUtils.isEmpty(areaList)) {
			list = new ArrayList<LabelValueBean>(areaList.size());
			for (MArea mArea : areaList) {
				LabelValueBean bean = new LabelValueBean();
				bean.setValue(mArea.areaId.toString());
				bean.setLabel(mArea.areaName);
				list.add(bean);
			}
		}
		return list;
	}

	@Override
	public List<LabelValueBean> getAreaDetailList(Integer areaId) {
		
		List<LabelValueBean> list = null;
		
		List<MAreaDetail> areaDetailList = mAreaDetailDao.findAll();
		if (!CollectionUtils.isEmpty(areaDetailList)) {
			list = new ArrayList<LabelValueBean>(areaDetailList.size());
			for (MAreaDetail mAreaDetail : areaDetailList) {
				LabelValueBean bean = new LabelValueBean();
				bean.setValue(mAreaDetail.areaDetailId.toString());
				bean.setLabel(mAreaDetail.detailName);
				list.add(bean);
			}
		}
		return list;
		
	}

	@Override
	public List<LabelValueBean> getBusinessList() {
		List<LabelValueBean> list = null;
		
		List<MBusiness> businessList = mBusinessDao.findAll();
		if (!CollectionUtils.isEmpty(businessList)) {
			list = new ArrayList<LabelValueBean>(businessList.size());
			for (MBusiness business : businessList) {
				LabelValueBean bean = new LabelValueBean();
				bean.setValue(business.businessId.toString());
				bean.setLabel(business.name);
				list.add(bean);
			}
		}
		return list;
	}

}
