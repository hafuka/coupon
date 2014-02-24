package coupon.dao;

import static coupon.entity.MConfigNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import coupon.entity.MConfig;

/**
 * {@link MConfig}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/01/09 15:38:50")
public class MConfigDao extends AbstractDao<MConfig> {

	
	private List<MConfig> allList;
	private Map<String, MConfig> keyMap;
	
    /**
     * 識別子でエンティティを検索します。
     * 
     * @param name
     *            識別子
     * @return エンティティ
     */
    public MConfig findById(String name) {
        return select().id(name).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<MConfig> findAllOrderById() {
        return select().orderBy(asc(name())).getResultList();
    }

    
    
    public void load() {
    	allList = Collections.unmodifiableList(this.findAllOrderById());
    	Map<String, MConfig> tempMap = new HashMap<String, MConfig>();
    	for (MConfig data : allList) {
    		if (!tempMap.containsKey(data.name)) {
    			tempMap.put(data.name, data);
    		}
		}
    	keyMap = Collections.unmodifiableMap(tempMap);
    }
    
	public List<MConfig> getAllList() {
		return allList;
	}
	
	public MConfig getMConfig(String key) {
		if (keyMap == null) {
			load();
		}
		return keyMap.get(key);
	}
}