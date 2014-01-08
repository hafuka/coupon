package coupon.entity;

import coupon.entity.IUserAuthenticationNames._IUserAuthenticationNames;
import coupon.entity.IUserCouponNames._IUserCouponNames;
import coupon.entity.IUserNames._IUserNames;
import coupon.entity.MShopCouponNames._MShopCouponNames;
import coupon.entity.MShopNames._MShopNames;
import javax.annotation.Generated;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2014/01/08 13:48:21")
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