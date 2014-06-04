package coupon.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.struts.util.LabelValueBean;

import coupon.dao.MAreaDao;
import coupon.dao.MAreaDetailDao;
import coupon.dao.MBusinessDao;
import coupon.dao.MShopDao;
import coupon.entity.MArea;
import coupon.entity.MAreaDetail;
import coupon.entity.MBusiness;
import coupon.enums.RarityType;
import coupon.enums.Sex;
import coupon.service.PullDownService;

public class PullDownServiceImpl implements PullDownService {

	@Resource
	protected MAreaDao mAreaDao;
	@Resource
	protected MAreaDetailDao mAreaDetailDao;
	@Resource
	protected MBusinessDao mBusinessDao;
	@Resource
	protected MShopDao mShopDao;

	@Override
	public List<LabelValueBean> getAreaList() {

		List<LabelValueBean> list = null;

		List<MArea> areaList = mAreaDao.findAll();
		if (!CollectionUtils.isEmpty(areaList)) {
			list = new ArrayList<LabelValueBean>(areaList.size());
			for (MArea mArea : areaList) {

				Integer count = mShopDao.findAreaCount(mArea.areaId);
				if (count != null && count > 0) {
					LabelValueBean bean = new LabelValueBean();
					bean.setValue(mArea.areaId.toString());
					bean.setLabel(mArea.areaName);
					list.add(bean);
				}
			}
		}
		return list;
	}

	@Override
	public List<LabelValueBean> getAreaDetailList() {

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

	@Override
	public List<LabelValueBean> getAreaDetailList(Integer areaId) {

		List<LabelValueBean> list = null;

		List<MAreaDetail> areaDetailList = mAreaDetailDao.findByAreaId(areaId);
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
	public List<LabelValueBean> getRarityList() {
		List<LabelValueBean> list = new ArrayList<LabelValueBean>();
		for (RarityType rarityType : RarityType.values()) {
			LabelValueBean bean = new LabelValueBean();
			bean.setValue(rarityType.value.toString());
			bean.setLabel(rarityType.name);
			list.add(bean);
		}
		return list;
	}

	@Override
	public List<LabelValueBean> getYearList() {
		List<LabelValueBean> list = new ArrayList<LabelValueBean>();
		Calendar cal = Calendar.getInstance();

		int nowYear = cal.get(Calendar.YEAR);

		for (int i = 0; i < 100; i++) {
			LabelValueBean bean = new LabelValueBean();
			bean.setValue(String.valueOf(i + 1));
			if (i == 0) {
				bean.setLabel(String.valueOf(nowYear));
			} else {
				bean.setLabel(String.valueOf(nowYear - i));
			}
			list.add(bean);
		}
		return list;
	}

	@Override
	public List<LabelValueBean> getSexList() {
		List<LabelValueBean> list = new ArrayList<LabelValueBean>();
		for (Sex sex : Sex.values()) {
			LabelValueBean bean = new LabelValueBean();
			bean.setValue(sex.key.toString());
			bean.setLabel(sex.value);
			list.add(bean);
		}
		return list;
	}

}
