package coupon.entity;

import coupon.entity.IUserAuthenticationNames._IUserAuthenticationNames;
import coupon.entity.IUserCouponNames._IUserCouponNames;
import coupon.entity.IUserNames._IUserNames;
import coupon.entity.MConfigNames._MConfigNames;
import coupon.entity.MLoginBonusNames._MLoginBonusNames;
import coupon.entity.MShopCouponNames._MShopCouponNames;
import coupon.entity.MShopNames._MShopNames;
import javax.annotation.Generated;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2014/01/09 17:20:00")
public class Names {

    /**
     * {@link IUser}の名前クラスを返します。
     * 
     * @return IUserの名前クラス
     */
    public static _IUserNames iUser() {
        return new _IUserNames();
    }

    /**
     * {@link IUserAuthentication}の名前クラスを返します。
     * 
     * @return IUserAuthenticationの名前クラス
     */
    public static _IUserAuthenticationNames iUserAuthentication() {
        return new _IUserAuthenticationNames();
    }

    /**
     * {@link IUserCoupon}の名前クラスを返します。
     * 
     * @return IUserCouponの名前クラス
     */
    public static _IUserCouponNames iUserCoupon() {
        return new _IUserCouponNames();
    }

    /**
     * {@link MConfig}の名前クラスを返します。
     * 
     * @return MConfigの名前クラス
     */
    public static _MConfigNames mConfig() {
        return new _MConfigNames();
    }

    /**
     * {@link MLoginBonus}の名前クラスを返します。
     * 
     * @return MLoginBonusの名前クラス
     */
    public static _MLoginBonusNames mLoginBonus() {
        return new _MLoginBonusNames();
    }

    /**
     * {@link MShop}の名前クラスを返します。
     * 
     * @return MShopの名前クラス
     */
    public static _MShopNames mShop() {
        return new _MShopNames();
    }

    /**
     * {@link MShopCoupon}の名前クラスを返します。
     * 
     * @return MShopCouponの名前クラス
     */
    public static _MShopCouponNames mShopCoupon() {
        return new _MShopCouponNames();
    }
}