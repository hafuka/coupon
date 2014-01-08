package coupon.dao;

import javax.annotation.Generated;
import org.seasar.extension.unit.S2TestCase;

/**
 * {@link IUserAuthenticationDao}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2014/01/08 13:48:29")
public class IUserAuthenticationDaoTest extends S2TestCase {

    private IUserAuthenticationDao iUserAuthenticationDao;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("app.dicon");
    }

    /**
     * {@link #iUserAuthenticationDao}が利用可能であることをテストします。
     * 
     * @throws Exception
     */
    public void testAvailable() throws Exception {
        assertNotNull(iUserAuthenticationDao);
    }
}